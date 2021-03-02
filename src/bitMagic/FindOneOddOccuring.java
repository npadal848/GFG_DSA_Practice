package bitMagic;

import java.util.Scanner;

/*
 * 1. Brute force
 * 2. optimized
 */
public class FindOneOddOccuring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(find1(arr, n));
		System.out.println(find2(arr, n));
	}
	
	private static int find1(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			int count=0;
			for(int j=0; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count%2!=0) {
				return arr[i];
			}
		}
		return 0;
	}
	
	private static int find2(int[] arr, int n) {
		int res=0;
		
		for(int i=0; i<n; i++) {
			res=res^arr[i];
			System.out.print(res+" ");
		}
		return res;
	}
}
