package linkedList.singly;

public class SegregateEvenOddNodesOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		head = segregate(head);
		head.print();
		
		head.next = new Node(3);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);
		head.next.next.next.next = new Node(9);
		
		head = segregate(head);
		head.print();
	}

	private static Node segregate(Node head) {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;

		for (Node curr = head; curr != null; curr = curr.next) {
			int data = curr.data;
			if ((data & 1) == 0) {
				if (evenStart == null) {
					evenStart = curr;
					evenEnd = evenStart;
				} else {
					evenEnd.next = curr;
					evenEnd = curr;
				}
			} else {
				if (oddStart == null) {
					oddStart = curr;
					oddEnd = curr;
				} else {
					oddEnd.next = curr;
					oddEnd = curr;
				}
			}
		}
		if (evenStart == null || oddStart == null)
			return head;

		evenEnd.next = oddStart;
		oddEnd.next = null;

		return evenStart;
	}
}
