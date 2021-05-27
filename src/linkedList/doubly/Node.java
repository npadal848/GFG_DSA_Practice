package linkedList.doubly;

public class Node {
	int data;
	Node next;
	Node prev;

	public Node(int data) {
		this.data = data;
	}

	public void print() {
		Node curr = this;
		while (curr != null) {
			if (curr.prev != null)
				System.out.print("Prev: " + curr.prev.data + " : ");
			else
				System.out.print("Prev: " + curr.prev + " : ");
			System.out.print("Data: " + curr.data + " : ");
			curr = curr.next;
			if (curr != null)
				System.out.print("Next: " + curr.data);
			else
				System.out.print("Prev: " + curr);
			System.out.println();
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
