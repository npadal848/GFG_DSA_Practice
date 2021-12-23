package stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
//		Stack<Integer> stack=new Stack<>(); // Useful for Multithread application 
		ArrayDeque<Integer> stack=new ArrayDeque<>(); // Useful for Single application
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
