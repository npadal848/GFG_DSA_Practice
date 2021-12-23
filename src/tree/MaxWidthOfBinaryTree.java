package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(40);
		leftSubTree1.left.left = new Node(80);
		Node rightSubTree1 = root.right;
		rightSubTree1.right = new Node(50);
		rightSubTree1.left = new Node(60);

		Node root1 = new Node(10);
		root1.left = new Node(20);
		root1.right = new Node(30);
		Node leftSubTree11 = root1.left;
		leftSubTree11.left = new Node(40);
		leftSubTree11.right = new Node(50);
		Node rightSubTree11 = root1.right;
		rightSubTree11.right = new Node(60);
		rightSubTree11.left = new Node(70);
		
		System.out.println(maxWidth1(root));
		System.out.println(maxWidth1(root1));
	}

//	Time: O(n) and Space: O(max level of node)
	public static int maxWidth1(Node root) {
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int max = Integer.MIN_VALUE;
		while (!q.isEmpty()) {
			int size = q.size();
			max = Math.max(max, size);
			while (size-- > 0) {
				Node curr = q.poll();
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
		}
		return max;
	}
}
