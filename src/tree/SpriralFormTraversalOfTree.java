package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpriralFormTraversalOfTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(4);
		leftSubTree1.right = new Node(5);
		Node rightSubTree1 = root.right;
		rightSubTree1.left = new Node(6);
		rightSubTree1.right = new Node(7);

		Node root1 = new Node(10);
		root1.left = new Node(20);
		root1.right = new Node(30);
		Node rightSubTree11 = root1.right;
		rightSubTree11.left = new Node(40);
		rightSubTree11.right = new Node(50);
		Node rightleftSubTree1 = root1.right.left;
		rightleftSubTree1.left = new Node(60);
		rightleftSubTree1.right = new Node(70);
		Node rightRightSubTree1 = root1.right.right;
		rightRightSubTree1.right = new Node(80);

		spiralFormTraversal1(root);
		spiralFormTraversal1(root1);
		
//		spiralFormTraversal2(root);
		spiralFormTraversal2(root1);
	}

//	Time: O(n) and Space: O(n)
	public static void spiralFormTraversal1(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Stack<Integer> s = new Stack<>();
		boolean isReverse = false;
		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				Node curr = q.poll();
				if (isReverse)
					s.push(curr.data);
				else
					System.out.print(curr.data + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			if (isReverse) {
				while (!s.isEmpty()) {
					System.out.print(s.pop() + " ");
				}
			}
			isReverse = !isReverse;
		}
		System.out.println();
	}

//	Time: O(n) and Space: O(width of binary tree)
	public static void spiralFormTraversal2(Node root) {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while (!s1.isEmpty() || s2.isEmpty()) {
			while (!s1.isEmpty()) {
				Node curr = s1.pop();
				System.out.print(curr.data + " ");
				if (curr.left != null)
					s2.push(curr.left);
				if (curr.right != null)
					s2.push(curr.right);
			}
			while (!s2.isEmpty()) {
				Node curr = s2.pop();
				System.out.print(curr.data + " ");
				if (curr.right != null)
					s1.push(curr.right);
				if (curr.left != null)
					s1.push(curr.left);
			}
		}
		System.out.println();
	}
}
