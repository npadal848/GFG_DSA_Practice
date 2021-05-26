package linkedList;

public class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public void print() {
		Node current = this;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
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
}
