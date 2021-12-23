package linkedList.singly;

public class RecursiveReverseALinkedList1 {

	public static void main(String[] args) {
		Node head = null;
		head = reverse(head);
		head = new Node(10);
		head = reverse(head);
		System.out.println();
		head.print();
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.print();
		System.out.println();
		head = reverse(head);
		head.print();
	}

	static Node reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node restHead = reverse(head.next);
		Node restTail = head.next;
		restTail.next = head;
		head.next = null;
		return restHead;
	}
}
