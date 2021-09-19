package binarySearchTree;

public class SearchInBST {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.right = new Node(20);

		Node rootLeft = root.left;
		rootLeft.left = new Node(3);

		Node rootRight = root.right;
		rootRight.left = new Node(18);
		rootRight.right = new Node(80);

		rootRight.left.left = new Node(16);

		System.out.println(searchInRecursive(root, 16));
		System.out.println(searchInIterative(root, 3));
	}

	public static boolean searchInRecursive(Node root, int x) {
		if (root == null)
			return false;
		else if (root.data == x)
			return true;
		else if (root.data > x)
			return searchInRecursive(root.left, x);
		else
			return searchInRecursive(root.right, x);
	}

	public static boolean searchInIterative(Node root, int x) {
		Node curr = root;
		while (curr != null) {
			if (curr.data == x)
				return true;
			else if (curr.data > x)
				curr = curr.left;
			else
				curr = curr.right;
		}
		return false;
	}
}
