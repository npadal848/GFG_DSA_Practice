package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isBalanced(s));
	}

	static boolean isBalanced(String s) {
//		Stack<Character> stack = new Stack<>(); --> Use in Multi threaded application
		Deque<Character> stack = new ArrayDeque<>(); // Use for single thread application
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if (stack.isEmpty() || !isMatching(stack.pop(), s.charAt(i)))
				return false;
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}

	static boolean isMatching(char stackChar, char strChar) {
		return ((stackChar == '(' && strChar == ')') || (stackChar == '[' && strChar == ']')
				|| (stackChar == '{' && strChar == '}'));
	}
}
