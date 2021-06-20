package linkedList.singly;

import java.util.HashSet;
import java.util.Set;

public class DetectLoopInSLL {

	public static void main(String[] args) {
		Node head = null;
		System.out.println(isLoopDetected1(head));
		System.out.println(isLoopDetected2(head));
		System.out.println();
		
		head = new Node(10);
		Node temp1 = new Node(15);
		Node temp2 = new Node(12);
		Node temp3 = new Node(25);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp1;
		System.out.println(isLoopDetected1(head));
		System.out.println(isLoopDetected2(head));
		System.out.println();

		Node head1 = new Node(10);
		head1.next = new Node(20);
		System.out.println(isLoopDetected1(head1));
		System.out.println(isLoopDetected2(head1));
		System.out.println();

		Node head2 = new Node(10);
		head2.next = new Node(20);
		head2.next.next = new Node(30);
		head2.next.next.next = head2;
		System.out.println(isLoopDetected1(head2));
		System.out.println(isLoopDetected2(head2));
		System.out.println();
	}

//	Time: O(n) and Space: O(n)
	private static boolean isLoopDetected1(Node head) {
		if (head == null)
			return false;
		if (head.next == head)
			return true;

		Node curr = head;
		Set<Node> set = new HashSet<>();
		while (curr != null) {
			if (!set.add(curr))
				return true;
			curr = curr.next;
		}
		return false;
	}

//	Time: O(n) and Space: O(1)
	private static boolean isLoopDetected2(Node head) {
		if (head == null)
			return false;
		if (head.next == head)
			return true;

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}
}
