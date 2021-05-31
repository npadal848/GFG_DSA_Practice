package linkedList.singly;

public class SortedInsertInASinglyLinkedList {

	public static void main(String[] args) {
		Node head = null;
		head = sortedInsert(head, 10);
		head.print();
		head = sortedInsert(head, 20);
		head.print();
		head = sortedInsert(head, 15);
		head.print();
		head = sortedInsert(head, 5);
		head.print();
	}

	static Node sortedInsert(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			return temp;
		}
		if (data < head.data) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while (curr.next != null && data > curr.next.data) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
}
