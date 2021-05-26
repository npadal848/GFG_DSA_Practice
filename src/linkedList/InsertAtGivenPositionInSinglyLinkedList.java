package linkedList;

public class InsertAtGivenPositionInSinglyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		System.out.println(head.size());
	}

	static Node insertAtPosition(Node head, int data, int pos) {
		int count = 0;
		if (head == null)
			return head;
		if (pos > head.size())
			return head;

		Node curr = head;
		Node prev = head;
		while (count != pos - 1) {
			prev = curr;
			curr = curr.next;
			count++;
		}
		Node temp = new Node(data);
		temp.next = curr;
		return curr;
	}
}
