package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStackUsingArrayList {

	List<Integer> list = null;

	public MyStackUsingArrayList() {
		list = new ArrayList<Integer>();
	}

	public static void main(String[] args) {
		MyStackUsingArrayList stack = new MyStackUsingArrayList();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.print();

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println();
		stack.print();
		stack.push(50);
		stack.push(31);
		stack.push(45);
		stack.push(55);
		stack.print();
//
//		System.out.println("=========");
//		MyStackUsingArrayList temp = new MyStackUsingArrayList();
//		temp.push(10);
//		temp.push(20);
//		temp.push(30);
//		temp.push(15);
//		temp.push(20);
//		temp.push(35);
//		temp.print();
//
//		System.out.println("=========");
//		MyStackUsingArrayList temp1 = new MyStackUsingArrayList();
//		temp1.peek();
//		temp1.pop();
	}

	public void push(int data) {
		list.add(data);
	}

	public int pop() {
		int data = list.get(list.size()-1);
		list.remove(list.size()-1);
		return data;
	}

	public int peek() {
		return list.get(list.size()-1);
	}

	public int size() {
		return list.size();
	}

	public void print() {
		for (int num : this.list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
