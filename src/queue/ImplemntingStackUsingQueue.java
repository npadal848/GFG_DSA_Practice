package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplemntingStackUsingQueue {

	Queue<Integer> q1, q2;

	public static void main(String[] args) {
		ImplemntingStackUsingQueue queue = new ImplemntingStackUsingQueue();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
	}
	
	public ImplemntingStackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	public void push(int x) {
		while (!q1.isEmpty())
			q2.offer(q1.poll());
		q1.offer(x);
		while (!q2.isEmpty())
			q1.offer(q2.poll());
	}

	public int pop() {
		return q1.poll();
	}

	public int peek() {
		return q1.peek();
	}
}
