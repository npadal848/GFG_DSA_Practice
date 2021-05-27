package linkedList.singly;

public class DeleteLastOfSinglyLinkedList {

	public static void main(String[] args) {
		Node head = null;
		System.out.println(deleteEndNode(head));
		System.out.println();
		head=new Node(10);
		System.out.println(deleteEndNode(head));
		System.out.println();
		head=new Node(10);
		head.next=new Node(20);
		head.print();
		System.out.println("Delete Last Node");
		head=deleteEndNode(head);
		head.print();
	}

	// Time: Theta(n)
	static Node deleteEndNode(Node head) {
		if (head == null)
			return head;
		Node curr = head;
		if (curr.next == null)
			return curr.next;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
}
