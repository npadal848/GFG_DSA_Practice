package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInBST {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.right = new Node(20);

		Node rootLeft = root.left;
		rootLeft.left = new Node(3);

		Node rootRight = root.right;
		rootRight.left = new Node(18);
		rootRight.right = new Node(80);

		System.out.println("Before insert");
		printBST(root);
		System.out.println();

//		printBST(insertRecursive(root, 6));
//		System.out.println("After insert Recursively");
//		System.out.println();
		printBST(insertInteratively(root, 6));
		System.out.println("After insert Interatively");
	}

	public static Node insertRecursive(Node root, int x) {
		if (root == null)
			return new Node(x);
		if (root.data > x)
			root.left = insertRecursive(root.left, x);
		else
			root.right = insertRecursive(root.right, x);
		return root;
	}

	public static Node insertInteratively(Node root, int x) {
		Node temp = new Node(x);
		Node parent = null;
		Node curr = root;
		while (curr != null) {
			parent = curr;
			if (curr.data > x)
				curr = curr.left;
			else if (curr.data < x)
				curr = curr.right;
			else
				return root;
		}
		if (parent == null) {
			return temp;
		}

		if (parent.data < x)
			parent.right = temp;
		else
			parent.left = temp;
		return root;
	}

	public static void printBST(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				Node curr = q.poll();
				System.out.print(curr.data + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
}
