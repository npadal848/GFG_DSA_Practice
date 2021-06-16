package stack;

import java.util.Arrays;

public class MyStackUsingArray {

	int[] arr = new int[10];
	int cap = 0;
	int top = 0;

	public MyStackUsingArray() {
		Arrays.fill(arr, -1);
	}

	public MyStackUsingArray(int cap) {
		top--;
		this.cap = cap;
		arr = new int[cap];
	}

	public static void main(String[] args) {
		MyStackUsingArray stack = new MyStackUsingArray(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.print();

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		stack.print();
		stack.push(30);
		stack.print();
		
		System.out.println("=========");
		MyStackUsingArray temp = new MyStackUsingArray(5);
		temp.push(10);
		temp.push(20);
		temp.push(30);
		temp.push(15);
		temp.push(20);
		temp.push(35);
		temp.print();
		
		System.out.println("=========");
		MyStackUsingArray temp1 = new MyStackUsingArray(5);
		temp1.peek();
		temp1.pop();
	}

	public void push(int data) {
		if (top == cap - 1) {
			System.out.println("Stackoverflow");
			return;
		}
		top++;
		arr[top] = data;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("EmptyStack");
			return -1;
		}
		int data = arr[top];
		arr[top] = 0;
		top--;
		return data;
	}

	public int peek() {
		if (top == -1) {
			System.out.println("EmptyStack");
			return -1;
		}
		return arr[top];
	}

	public int size() {
		return top + 1;
	}

	public void print() {
		for (int num : this.arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
