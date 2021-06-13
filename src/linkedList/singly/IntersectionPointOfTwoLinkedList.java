package linkedList.singly;

import java.util.HashSet;
import java.util.Set;

public class IntersectionPointOfTwoLinkedList {

	public static void main(String[] args) {
		Node head1 = new Node(5);
		head1.next = new Node(8);
		head1.next.next = new Node(7);
		head1.next.next.next = new Node(10);
		head1.next.next.next.next = new Node(12);
		head1.next.next.next.next.next = new Node(15);
		head1.print();

		Node head2 = new Node(9);
		head2.next = new Node(10);
		head2.next.next = new Node(12);
		head2.next.next.next = new Node(15);
		head2.print();
		System.out.println(getIntersectionPoint1(head1, head2));
		System.out.println(getIntersectionPoint2(head1, head2));
		System.out.println(getIntersectionPoint3(head1, head2));
	}

//	Time: O(n+m) and Space: O(n)
	private static int getIntersectionPoint1(Node head1, Node head2) {
		Set<Integer> set = new HashSet<>();
		Node curr = head1;
		while (curr != null) {
			set.add(curr.data);
			curr = curr.next;
		}
		curr = head2;
		while (curr != null) {
			if (!set.add(curr.data))
				return curr.data;
			curr = curr.next;
		}
		return 0;
	}

//	Time: O(n+m) and Space: O(1)
	private static int getIntersectionPoint2(Node head1, Node head2) {
		int size1 = head1.size();
		int size2 = head2.size();
		int diff = Math.abs(size1 - size2); // get absolute difference of two list
		Node curr = null;
		Node curr2 = null;
		if (size1 < size2) {
			curr = head2;
			curr2 = head1;
		} else {
			curr = head1;
			curr2 = head2;
		}

		// move the longest list by diff
		for (int i = 0; i < diff && curr != null; i++) {
			curr = curr.next;
		}

		// check simultaneously for each node of two list for intersection point
		while (curr != null && curr2 != null) {
			if (curr.data == curr2.data)
				return curr.data;
			curr = curr.next;
			curr2 = curr2.next;
		}
		return 0;
	}

//	Java solution without knowing the difference in length
//	Time: O(n+m) and Space: O(1)
//	Solution: https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!
	private static int getIntersectionPoint3(Node head1, Node head2) {
		Node headA = head1;
		Node headB = head2;

		while (headA != headB) {
			headA = (headA == null) ? head2 : headA.next;
			headB = (headB == null) ? head1 : headB.next;
		}
		return headA.data;
	}
}
