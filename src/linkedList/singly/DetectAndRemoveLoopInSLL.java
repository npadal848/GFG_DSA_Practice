package linkedList.singly;

public class DetectAndRemoveLoopInSLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = head;
		removeLoop(head);
		head.print();

		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head.next;
		removeLoop(head);
		head.print();
	}

	private static void removeLoop(Node head) {
		if (head == null)
			return;
		if (head.next == head) {
			head.next = null;
			return;
		}
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (slow != fast)
			return;
		if (slow == head) {
			while (fast.next != slow) {
				fast = fast.next;
			}
		} else {
			slow = head;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		fast.next = null;
	}
}
