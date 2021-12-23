package linkedList.doubly;

public class DeleteLastOfADoublyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		head.print();
		System.out.println();
		head = delete(head);
		head.print();
		System.out.println();
		head = delete(head);
		head.print();
		System.out.println();
		head = delete(head);
		System.out.println(head);
	}

	static Node delete(Node head) {
		if (head == null || head.next == null)
			return null;
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
}
