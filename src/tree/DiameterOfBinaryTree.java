package tree;

public class DiameterOfBinaryTree {

	static int max = 0;

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(60);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(30);
		leftSubTree1.right = new Node(80);
		leftSubTree1.left.left = new Node(40);
		leftSubTree1.left.right = new Node(50);
		leftSubTree1.left.left.left = new Node(60);
		leftSubTree1.right.right = new Node(90);
		leftSubTree1.right.right.right = new Node(80);

		System.out.println(getDiameter(root));
	}

	public static int getDiameter(Node root) {
		if (root == null)
			return 0;
		int d1 = 1 + getHeight(root.left) + getHeight(root.right);
		
		int d2 = getDiameter(root.left);
		int d3 = getDiameter(root.right);
		
		return Math.max(d1, Math.max(d2, d3));
	}

	private static int getHeight(Node root) {
		if (root == null)
			return 0;
		return Math.max(getDiameter(root.left), getDiameter(root.right)) + 1;
	}
}
