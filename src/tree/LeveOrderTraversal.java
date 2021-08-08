package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeveOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(8);
		Node rightSubTree1 = root.right;
		rightSubTree1.right = new Node(7);
		Node rightSubTree2 = rightSubTree1.right;
		rightSubTree2.left = new Node(11);
		rightSubTree2.right = new Node(12);

		printLevelOrder1(root);
		System.out.println();
		printLevelOrder2(root);
		System.out.println();
		printLevelOrder3(root);
	}

//	Time: O(h*n) and Space: O(n)
	public static void printLevelOrder1(Node root) {
		int height = getHeight(root);
		for (int i = 0; i < height; i++) {
			printNode(root, i);
		}
	}

//	Time: O(n) and Space: Theta(n)
	public static void printLevelOrder2(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
	}

//	Time: O(n) and Space: O(1)
	public static void printLevelOrder3(Node root) {
		Node temp = root;
		while (temp != null) {
			Node levelHead = new Node(0);
			Node node = levelHead;
			while (temp != null) {
				System.out.print(temp.data + " ");
				if (temp.left != null) {
					node.next = temp.left;
					node = node.next;
				}
				if (temp.right != null) {
					node.next = temp.right;
					node = node.next;
				}
				temp = temp.next;
			}
			temp = levelHead.next;
		}
	}

	private static void printNode(Node root, int k) {
		if (root == null)
			return;
		else if (k == 0)
			System.out.print(root.data + " ");
		else {
			printNode(root.left, k - 1);
			printNode(root.right, k - 1);
		}
	}

	private static int getHeight(Node root) {
		if (root == null)
			return 0;
		else
			return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}
