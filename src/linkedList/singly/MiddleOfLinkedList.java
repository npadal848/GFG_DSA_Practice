package linkedList.singly;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		Node head = null;
		midOfLL1(head);
		midOfLL2(head);
		System.out.println();
		head = new Node(10);
		midOfLL1(head);
		midOfLL2(head);
		System.out.println();
		head.next = new Node(20);
		midOfLL1(head);
		midOfLL2(head);
		System.out.println();
		Node temp1 = new Node(30);
		Node temp2 = new Node(40);
		Node temp3 = new Node(50);
		Node temp4 = new Node(60);
		head.next.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		midOfLL1(head);
		midOfLL2(head);
		System.out.println();
	}

//	Time: O(n)
	static void midOfLL1(Node head) {
		if (head == null)
			return;
		int size = 0;
		Node mid = head;
		for (Node curr = head; curr != null; curr = curr.next)
			size++;
		for (int i = 0; i < size / 2; i++)
			mid = mid.next;
		System.out.println(mid.data);
	}

//	Time: O(n) // Improved solution: One traversal
	static void midOfLL2(Node head) {
		if (head == null)
			return;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
}
