package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		Node root = new Node(1);
		Node leftSubTree = new Node(2);
		leftSubTree.right = new Node(5);
		root.left = leftSubTree;
		Node rightSubTree1 = new Node(3);
		rightSubTree1.left = new Node(4);
		root.right = rightSubTree1;
		rightSubTree1.left.right = new Node(6);

		System.out.println(getRightView(root));
	}

//	Time: O(n) and Space: O(n)
	public static List<Integer> getRightView(Node root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			res.add(curr.data);
			if (curr.right != null)
				q.add(curr.right);
			else if (curr.left != null)
				q.add(curr.left);

		}
		return res;
	}
}
