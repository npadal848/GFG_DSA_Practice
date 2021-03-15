package recursion;

import java.util.Scanner;

public class SubSetSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(count(arr, n, n));
	}

	static int count(int[] arr, int n, int sum) {
		if (n == 0) {
			return sum == 0 ? 1 : 0;
		}
		
		return count(arr, n-1, sum)+count(arr, n-1, sum-arr[n-1]);
	}
}
