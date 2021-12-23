package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxNodeInBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(8);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(20);
		
		System.out.println(maxNode(root));
	}

//	Time: O(n) and Space: O(Width of Binary Tree)
	public static int maxNode(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int max = 0;
		while (!q.isEmpty()) {
			Node curr = q.poll();
			max = Math.max(max, curr.data);
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
		return max;
	}
}
