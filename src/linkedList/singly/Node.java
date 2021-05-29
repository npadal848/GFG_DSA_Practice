package linkedList.singly;

public class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public void print() {
		Node current = this;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int size() {
		int size = 0;
		Node current = this;
		while (current != null) {
			size++;
			current = current.next;
		}
		return size;
	}

	public void printNode() {
		Node head = this;
		System.out.print(head.data + " ");
		Node curr = head.next;
		while (curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
