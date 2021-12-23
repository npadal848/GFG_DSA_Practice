package tree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(30);
		Node rightSubTree = root.right;
		rightSubTree.left = new Node(40);
		rightSubTree.right = new Node(50);
		System.out.println(getHeight(root));
	}

//	Time: O(n) and Space: O(h)
	public static int getHeight(Node root) {
		if (root == null)
			return 0;
		else
			return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}
