package linkedList.singly;

public class DeleteHeadOfCircularLinkedList {

	public static void main(String[] args) {
		Node head = null;
		head = deleteHead1(head);
		PrintCircularLL.printNode(head);
		head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;

		PrintCircularLL.printNode(head);
		head = deleteHead1(head);
		PrintCircularLL.printNode(head);
		head = deleteHead2(head);
		PrintCircularLL.printNode(head);
	}

//	Time: Theta(n)
	static Node deleteHead1(Node head) {
		if (head == null)
			return null;
		if (head.next == head)
			return null;
		Node curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}
		curr.next = head.next;
		return curr.next;
	}

//	Time: O(1)
	static Node deleteHead2(Node head) {
		if (head == null)
			return null;
		if (head.next == head)
			return null;
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}
}
