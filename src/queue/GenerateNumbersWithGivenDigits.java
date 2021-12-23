package queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {

	public static void main(String[] args) {
		int[] arr = { 5, 6 };
		int k = 10;
		
		generateNumber(arr, k);
	}

	static void generateNumber(int[] nums, int k) {
		Queue<String> queue = new LinkedList<>();
		for(int num: nums)
			queue.offer(String.valueOf(num));
		for(int i=0; i<k; i++) {
			String num = queue.poll();
			System.out.print(num+" ");
			queue.offer(num+"5");
			queue.offer(num+"6");
		}
	}
}
