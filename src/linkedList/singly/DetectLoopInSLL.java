package linkedList.singly;

import java.util.HashSet;
import java.util.Set;

public class DetectLoopInSLL {

	public static void main(String[] args) {
		Node head = null;
		System.out.println(isLoopDetected(head));

		head = new Node(10);
		Node temp1 = new Node(15);
		Node temp2 = new Node(12);
		Node temp3 = new Node(25);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp1;
		System.out.println(isLoopDetected(head));

		Node head1 = new Node(10);
		head1.next = new Node(20);
		System.out.println(isLoopDetected(head1));

		Node head2 = new Node(10);
		head2.next = new Node(20);
		head2.next.next = new Node(30);
		head2.next.next.next = head2;
		System.out.println(isLoopDetected(head2));
	}

	private static boolean isLoopDetected(Node head) {
		if (head == null)
			return false;
		if (head.next == head)
			return true;

		Node curr = head;
		Set<Integer> set = new HashSet<Integer>();
		while (curr != null) {
			if (!set.add(curr.data))
				return true;
			curr = curr.next;
		}
		return false;
	}
}
