package binarySearchTree;

public class DeleteionInBST {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(6);

		Node rootLeft = root.left;
		rootLeft.left = new Node(2);
		rootLeft.right = new Node(4);

		Node rootRight = root.right;
		rootRight.right = new Node(7);

		InsertInBST.printBST(root);
		System.out.println();
		InsertInBST.printBST(deleteNode(root, 3));
	}

	public static Node deleteNode(Node root, int key) {
		if (root == null)
			return null;
		else if (root.data < key)
			root.left = deleteNode(root.left, key);
		else if (root.data < key)
			root.right = deleteNode(root.right, key);
		else {
			if (root.left == null)
				return root.left;
			else if (root.right == null)
				return root.right;
			else {
				Node succsor = getSuccessor(root);
				root.data = succsor.data;
				root.right = deleteNode(root.right, key);
			}
		}
		return root;
	}

	private static Node getSuccessor(Node root) {
		Node curr = root.right;
		while (curr != null && curr.left != null)
			curr = curr.left;
		return curr;
	}
}
