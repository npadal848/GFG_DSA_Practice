package tree;

public class PrintNodeOfDistanceK {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(8);
		Node rightSubTree1 = root.right;
		rightSubTree1.right = new Node(7);
		Node rightSubTree2 = rightSubTree1.right;
		rightSubTree2.left=new Node(11);
		rightSubTree2.right=new Node(12);

		int k = 2;
		printNode(root, k);
	}

//	Time: O(n) and Space: O(h)
	public static void printNode(Node root, int k) {
		if (root == null)
			return;
		else if (k == 0)
			System.out.print(root.data + " ");
		else {
			printNode(root.left, k - 1);
			printNode(root.right, k - 1);
		}
	}
}
