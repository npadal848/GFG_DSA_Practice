package stack;

import java.util.List;

public class StackWithGetMinInO1 {

	private int[] stack;
	private int[] minStack;
	private int minTop;
	private int top;
	private int size;
	private int cap;

	public StackWithGetMinInO1(int cap) {
		this.cap = cap;
		stack = new int[cap];
		minStack = new int[cap];
		top = -1;
		minTop = -1;
	}

	public void push(int data) {
		if (isFull())
			return;
		if (isEmpty()) {
			minTop++;
			minStack[minTop] = data;
		} else if (data <= minStack[minTop]) {
			minTop++;
			minStack[minTop] = data;
		}
		top++;
		stack[top] = data;
		size++;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int data = stack[top];
		if (data == minStack[minTop]) {
			minTop--;
		}
		top--;
		size--;
		return data;
	}

	public int peek() {
		if (isEmpty())
			return -1;
		return stack[top];
	}

	public int getMin() {
		return minStack[minTop];
	}

	public boolean isFull() {
		return (size == cap);
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public static void main(String[] args) {
		List<Integer> inte;
		StackWithGetMinInO1 stack = new StackWithGetMinInO1(5);
		stack.push(10);
		System.out.println(stack.getMin());

		stack.push(2);
		stack.push(5);
		System.out.println(stack.getMin());

		stack.push(1);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
		
	}

}
abstract class Simbba{
}
