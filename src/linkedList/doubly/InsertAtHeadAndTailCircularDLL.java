package linkedList.doubly;

public class InsertAtHeadAndTailCircularDLL {

	public static void main(String[] args) {
		Node head = null;
		head = insertAtBegin(head, 10);
		head.next = head;
		head.prev = head;
		PrintCircularLL.printNode(head);

		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		head.prev = temp2;
		PrintCircularLL.printNode(head);
		head = insertAtBegin(head, 5);
		PrintCircularLL.printNode(head);
		head = insertAtBegin(head, 2);
		PrintCircularLL.printNode(head);
		
		head = insertAtEnd(head, 40);
		PrintCircularLL.printNode(head);
	}

	static Node insertAtBegin(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
//		Node tail = head.prev; // Commented code also works fine
//		tail.next = temp;
//		temp.prev = tail;
//		temp.next = head;
//		head.prev = temp;
		temp.next=head;
		head.prev.next=temp;
		temp.prev=head.prev;
		head.prev=temp;
		return temp;
	}
	
	static Node insertAtEnd(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
//		Node tail = head.prev; // Commented code also works fine
//		tail.next = temp;
//		temp.prev = tail;
//		temp.next = head;
//		head.prev = temp;
		temp.next=head;
		head.prev.next=temp;
		temp.prev=head.prev;
		head.prev=temp;
		return head;
	}
}
