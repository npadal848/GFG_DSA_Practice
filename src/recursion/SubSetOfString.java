package recursion;

import java.util.Scanner;

public class SubSetOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		printSubSet(str, 0, str.length());
	}
	
	static void printSubSet(String str, int start, int end) {
		for(int i=0; i<end; i++) {
			for(int j=0; j<end; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
