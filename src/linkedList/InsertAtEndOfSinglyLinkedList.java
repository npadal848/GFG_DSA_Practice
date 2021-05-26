package linkedList;

public class InsertAtEndOfSinglyLinkedList {

	public static void main(String[] args) {
		Node head = null;

		// insert at beginning of node
		head = insertAtEnd(head, 11);
		head = insertAtEnd(head, 12);
		head = insertAtEnd(head, 13);
		head = insertAtEnd(head, 14);
		head.print();
	}

	static Node insertAtEnd(Node head, int data) {
		Node temp = new Node(data);
		if (head == null)
			return temp;
		Node curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = temp;
		return head;
	}
}
