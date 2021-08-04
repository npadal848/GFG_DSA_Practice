package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(8);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(20);

		System.out.println(size1(root));
		System.out.println(size2(root));
	}

//	Time: O(n) and Space: O(h)-Its height+1
	public static int size1(Node root) {
		if (root == null)
			return 0;
		else
			return (size1(root.left) + size1(root.right)) + 1;
	}

//	Time: O(n) and Space: O(h)-Its height+1
	public static int size2(Node root) {
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int size = 0;
		while (!q.isEmpty()) {
			Node currNode = q.poll();
			if (currNode.left != null)
				q.offer(currNode.left);
			if (currNode.right != null)
				q.offer(currNode.right);
			size++;
		}
		return size;
	}

}
