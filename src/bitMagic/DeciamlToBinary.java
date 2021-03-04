package bitMagic;

import java.util.Arrays;
import java.util.Scanner;

public class DeciamlToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		int num=sc.nextInt();
		System.out.println(getBinaryRep(num));
	}
	
	static String getBinaryRep(int N){
        int[] binary=new int[32];
        int i=binary.length-1;
        while(N>0){
            binary[i]=N%2;
            N=N/2;
            i--;
        }
        StringBuilder sc=new StringBuilder();
        for(int num: binary) {
        	sc.append(num);
        }
        
        return sc.toString();
    }
}
