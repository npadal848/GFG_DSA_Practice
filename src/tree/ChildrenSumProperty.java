package tree;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(4);
		root.right = new Node(2);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(3);
		leftSubTree1.right = new Node(1);
		Node rightSubTree1 = root.right;
		rightSubTree1.right = new Node(1);
		rightSubTree1.left = new Node(1);

		Node root1 = new Node(6);
		root1.left = new Node(4);
		root1.right = new Node(2);
		Node leftSubTree11 = root1.left;
		leftSubTree11.left = new Node(3);
		leftSubTree11.right = new Node(2);
		Node rightSubTree11 = root1.right;
		rightSubTree11.right = new Node(1);
		rightSubTree11.left = new Node(1);

		System.out.println(ischildSum(root));
		System.out.println(ischildSum(root1));
	}

//	Time: O(n) and Space: O(h) h-> Height of the binary tree
	static boolean ischildSum(Node root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
		int sum = 0;
		if (root.left != null)
			sum += root.left.data;
		if (root.right != null)
			sum += root.right.data;
		return (root.data == sum && (ischildSum(root.left) && ischildSum(root.right)));
	}
}
