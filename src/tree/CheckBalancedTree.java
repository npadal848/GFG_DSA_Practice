package tree;

public class CheckBalancedTree {

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(12);
		root.right = new Node(15);
		Node leftSubTree1 = root.left;
		leftSubTree1.left = new Node(13);
		leftSubTree1.right = new Node(14);
		Node rightSubTree1 = root.right;
		rightSubTree1.right = new Node(16);

		Node root1 = new Node(8);
		root1.left = new Node(12);
		root1.right = new Node(15);
		Node leftSubTree11 = root1.left;
		leftSubTree11.left = new Node(13);
		leftSubTree11.right = new Node(14);
		Node rightSubTree11 = root1.right;
		rightSubTree11.right = new Node(16);
		rightSubTree11.right.right = new Node(17);

		System.out.println(isBalancedTree1(root));
		System.out.println(isBalancedTree1(root1));
		System.out.println();
		System.out.println(isBalancedTree2(root));
		System.out.println(isBalancedTree2(root1));
		System.out.println();
		System.out.println(isBalancedTree3(root));
		System.out.println(isBalancedTree3(root1));
	}

//	Time: O(n^2) and Space: O(h) h-> Height of the binary tree
	static boolean isBalancedTree1(Node root) {
		if (root == null)
			return true;
		int h1 = getHeight(root.left);
		int h2 = getHeight(root.right);
		return (Math.abs(h1 - h2) <= 1) && isBalancedTree1(root.left) && isBalancedTree1(root.right);
	}

//	Time: O(n) and Space: O(h) h-> Height of the binary tree
	static boolean isBalancedTree2(Node root) {
		return (isBalance1(root) != -1);
	}

//	Time: O(n) and Space: O(h) h-> Height of the binary tree
	static boolean isBalancedTree3(Node root) {
		return isBalance2(root).isBal;
	}

	private static Pair isBalance2(Node root) {
		if (root == null) {
			Pair pair = new Pair();
			pair.isBal = true;
			return pair;
		}
		Pair lPair = isBalance2(root.left);
		Pair rPair = isBalance2(root.right);

		Pair pair = new Pair();
		pair.isBal = ((lPair.isBal && rPair.isBal) && Math.abs(lPair.height - rPair.height) <= 1);
		if (!pair.isBal)
			return pair;
		pair.height = Math.max(lPair.height, rPair.height) + 1;
		return pair;
	}

	private static int isBalance1(Node root) {
		if (root == null)
			return 0;
		int lh = isBalance1(root.left);
		int rh = isBalance1(root.right);
		if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1)
			return -1;
		return Math.max(lh, rh) + 1;
	}

	private static int getHeight(Node root) {
		if (root == null)
			return 0;
		else
			return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}

class Pair {
	int height;
	boolean isBal;
}
