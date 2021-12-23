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
			char currBracket = s.charAt(i);
			if (currBracket == '(' || currBracket == '[' || currBracket == '{')
				stack.push(currBracket);
			else if (stack.isEmpty() || !isMatching(stack.pop(), currBracket))
				return false;
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}

	static boolean isMatching(char recentOpenBracket, char currBracket) {
		return ((recentOpenBracket == '(' && currBracket == ')') || (recentOpenBracket == '[' && currBracket == ']')
				|| (recentOpenBracket == '{' && currBracket == '}'));
	}
}
