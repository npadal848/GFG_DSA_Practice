package linkedList.doubly;

public class ReverseDulblyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		head.print();
		System.out.println();
		head = reverse(head);
		head.print();

	}

	static Node reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
	}
}
