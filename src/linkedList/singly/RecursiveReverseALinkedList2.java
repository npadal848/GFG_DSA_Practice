package linkedList.singly;

public class RecursiveReverseALinkedList2 {

	public static void main(String[] args) {
		Node head = null;
		head = reverse(head, null);
		head = new Node(10);
		head = reverse(head, null);
		head.print();
		System.out.println();
		
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.print();
		System.out.println();
		
		head = reverse(head, null);
		head.print();
	}

	static Node reverse(Node curr, Node prev) {
		if (curr == null)
			return prev;
		Node next = curr.next;
		curr.next = prev;
		return reverse(next, curr);
	}
}
