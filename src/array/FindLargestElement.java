package array;

import java.util.Scanner;

public class FindLargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(findLargestEle(arr, n));
	}
	
	static int findLargestEle(int[] arr, int n) {
		int index=0;
		
		for(int i=0; i<n; i++) {
			if(arr[index]<arr[i]) {
				index=i;
				
			}
		}
		
		return index;
	}
}
