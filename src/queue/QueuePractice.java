package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueuePractice {

	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.pollLast());
		System.out.println(queue);
	}
}
