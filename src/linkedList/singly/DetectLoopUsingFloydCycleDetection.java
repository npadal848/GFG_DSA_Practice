package linkedList.singly;

public class DetectLoopUsingFloydCycleDetection {

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

//	Time: O(m+n) => O(n) and Space: O(1) 
	private static boolean isLoopDetected(Node head) {
		if (head == null)
			return false;
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
