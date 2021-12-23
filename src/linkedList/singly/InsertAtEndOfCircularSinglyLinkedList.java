package linkedList.singly;

public class InsertAtEndOfCircularSinglyLinkedList {

	public static void main(String[] args) {
		Node head = null;
		head = insertAtEnd1(head, 10);
		printNode(head);
		Node temp1 = new Node(15);
		Node temp2 = new Node(20);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		head = insertAtEnd1(head, 5);
		printNode(head);
		head = insertAtEnd1(head, 2);
		printNode(head);
		head = insertAtEnd2(head, 1);
		printNode(head);
	}

//	Time: Theta(n)
	static Node insertAtEnd1(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			temp.next = temp;
			return temp;
		}
		Node curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.next = head;
		return head;
	}

//	Time: O(1)
	static Node insertAtEnd2(Node head, int data) {
		Node temp = new Node(data);
		if (head == null)
			return temp;
		temp.next = head.next;
		head.next = temp;
		int headData = head.data;
		head.data = temp.data;
		temp.data = headData;
		return temp;
	}

	static void printNode(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		Node curr = head.next;
		while (curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
