package binarySearchTree;

public class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node random) {
		this.data = data;
		this.right = random;
	}

	public void print() {
		Node current = this;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.left;
		}
		System.out.println();
	}

	public int size() {
		int size = 0;
		Node current = this;
		while (current != null) {
			size++;
			current = current.left;
		}
		return size;
	}

	public void printNode() {
		Node head = this;
		System.out.print(head.data + " ");
		Node curr = head.left;
		while (curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.left;
		}
		System.out.println();
	}
}
