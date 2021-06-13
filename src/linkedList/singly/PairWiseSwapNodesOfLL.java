package linkedList.singly;

public class PairWiseSwapNodesOfLL {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.print();
		head = pairWiseSwap1(head);
		head.print();

		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.print();
		head1 = pairWiseSwap2(head1);
		head1.print();
	}

//	Time: O(n) and Space: O(1) , Swap 2 node data
	private static Node pairWiseSwap1(Node head) {
		if (head == null)
			return head;

		Node curr = head;
		while (curr != null && curr.next != null) {
			int data = curr.data;
			curr.data = curr.next.data;
			curr.next.data = data;
			curr = curr.next.next;
		}
		return head;
	}

//	Time: O(n) and Space: O(1) // Swap reference of Two nodes
	private static Node pairWiseSwap2(Node head) {
		if (head == null || head.next == null)
			return head;
		Node curr = head.next.next;
		Node prev = head;
		head = head.next;
		head.next = prev;

		while (curr != null && curr.next != null) {
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = curr;
			curr = next;
		}
		prev.next = curr;
		return head;
	}
}
