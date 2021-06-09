package linkedList.singly;

public class FindLengthOfLoopOfLL {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp2;
		
		System.out.println(getLoopLength(head));
	}

	private static int getLoopLength(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			if (slow.next == fast)
				break;
			slow = slow.next;
		}
		int count = 1;
		while (fast != slow) {
			fast = fast.next;
			count++;
		}
		return count;
	}
}
