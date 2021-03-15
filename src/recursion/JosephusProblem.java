package recursion;

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		System.out.println(solution(n, k));
	}
	
	static int solution(int n, int k) {
		
		if(n==1) {
			return 0;
		}
		
		//In one line
		return (solution(n-1, k)+k)%n;
		
		//For easy understanding for above one line code
//		int x=solution(n-1, k);
//		int y=(x+k)%n;
//		return y;
	}
}
