package linkedList.singly;

public class CircularLinkedListTraversal {

	public static void main(String[] args) {
		Node head = null;
		traverse1(head);
		head = new Node(10);
		head.next = head;
		traverse1(head);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		traverse2(head);
		Node temp3 = new Node(40);
		temp2.next = temp3;
		temp3.next = head;
		traverse3(head);
	}

//	Method - 1
	static void traverse1(Node head) {
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

//	Method - 2
	static void traverse2(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		for (Node curr = head.next; curr != head; curr = curr.next)
			System.out.print(curr.data + " ");
		System.out.println();
	}

//	Method - 3
	static void traverse3(Node head) {
		if (head == null)
			return;
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);
	}
}
