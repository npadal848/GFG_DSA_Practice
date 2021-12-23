package linkedList.singly;

public class InsertAtBeginOfCircularSinglyLinkedLIst {

	public static void main(String[] args) {
		Node head = null;
		head = insertAtBegin1(head, 10);
		head.next = head;
		printNode(head);

		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		printNode(head);
		head = insertAtBegin1(head, 5);
		printNode(head);

		Node newHead = null;
		newHead = insertAtBegin2(newHead, 10);
		printNode(newHead);
		Node newtemp1 = new Node(15);
		Node newtemp2 = new Node(20);
		newHead.next = newtemp1;
		newtemp1.next = newtemp2;
		newtemp2.next = newHead;
		newHead = insertAtBegin2(newHead, 5);
		printNode(newHead);
		newHead = insertAtBegin2(newHead, 2);
		printNode(newHead);
		newHead = insertAtBegin2(newHead, 1);
		printNode(newHead);
	}

//	Time: O(n)
	static Node insertAtBegin1(Node head, int data) {
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
		return temp;
	}

//	Time: O(1)
	static Node insertAtBegin2(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			temp.next = temp;
			return temp;
		}
		temp.next = head.next;
		head.next = temp;
		int headData = head.data;
		head.data = temp.data;
		temp.data = headData;
		return head;
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
