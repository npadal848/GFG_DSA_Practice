package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(8);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(20);
		leftSubTree1.right = new Node(21);
		Node rightSubTree1 = root.right;
		rightSubTree1.right = new Node(7);
		Node rightSubTree2 = rightSubTree1.right;
		rightSubTree2.left = new Node(11);
		rightSubTree2.right = new Node(12);

		printLineByLine1(root);
		System.out.println();
		System.out.println("============");
		printLineByLine2(root);
		System.out.println();
		System.out.println("============");
		printLineByLine3(root);
	}

//	Time: O(n) and Space: O(width of binary tree)
	public static void printLineByLine1(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		start: while (q.size()>1) {
			Node currNode = q.poll();

			if (currNode == null) {
				System.out.println();
				q.add(null);
				continue start;
			}

			System.out.print(currNode.data + " ");
			if (currNode.left != null)
				q.offer(currNode.left);
			if (currNode.right != null)
				q.offer(currNode.right);

		}
	}

//	Time: O(n) and Space: O(n)
	public static void printLineByLine2(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				Node currNode = q.poll();
				System.out.print(currNode.data + " ");
				if (currNode.left != null)
					q.offer(currNode.left);
				if (currNode.right != null)
					q.offer(currNode.right);
			}
			System.out.println();
		}
	}
	
//	Time: O(n) and Space: O(1)
	public static void printLineByLine3(Node root) {
		Node temp = root;
		while (temp != null) {
			Node levelHead = new Node(0);
			Node node = levelHead;
			while (temp != null) {
				System.out.print(temp.data+" ");
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
			System.out.println();
			temp = levelHead.next;
		}
	}
}
