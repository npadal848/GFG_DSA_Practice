package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseAQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		while (n-- > 0)
			queue.offer(sc.nextInt());

//		System.out.println(reverse1(queue));
		reverse2(queue);
		System.out.println(queue);
		sc.close();
	}

//	Time: Theta(n) and space: Theta(n)
	static Queue<Integer> reverse1(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty())
			stack.push(queue.poll());
		while (!stack.isEmpty())
			queue.offer(stack.pop());
		return queue;
	}
	
//	Time: Theta(n) and space: Theta(n) // Recursive Solution
	static void reverse2(Queue<Integer> queue) {
		while(queue.isEmpty())
			return;
		int data = queue.poll();
		reverse2(queue);
		queue.offer(data);
	}
}
