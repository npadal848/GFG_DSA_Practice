package bitMagic;

import java.util.Scanner;

public class SubSetOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char[] arr=str.toCharArray();
		int len=str.length();
		int powerSet=(int) Math.pow(2, len);
		
		for(int counter=0; counter<=powerSet; counter++) {
			for(int j=0; j<len; j++) {
				if((counter & (1<<j))!=0){
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}
}
