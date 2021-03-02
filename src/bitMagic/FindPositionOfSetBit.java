package bitMagic;

import java.util.Scanner;

public class FindPositionOfSetBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(findPosition(num));
	}
	
	static int findPosition(int n) {
        // code here
        if(n==1) return 1;
        
        if(n==0 || getCountOfSetBit(n)>1) return -1;
        
        int pos=0;
        while(n>0){
            if((n&1)==1){
                pos++;
                return pos;
            }
            pos++;
            n=n>>1;
        }
        return pos;
    }
    
    static int getCountOfSetBit(int n){
        int[] arr=new int[256];
        arr[0]=0;
        arr[1]=1;
        int res=0;
        for(int i=2; i<256; i++){
            arr[i]=(i&1)+(arr[i/2]);
        }
        
        res=arr[n&0xff];
        n=n>>8;
        res=res+arr[n&0xff];
        n=n>>8;
        res=res+arr[n&0xff];
        n=n>>8;
        res=res+arr[n&0xff];
        
        return res;
    }
}
