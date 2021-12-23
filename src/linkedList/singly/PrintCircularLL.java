package linkedList.singly;

public class PrintCircularLL {

	public static void printNode(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		Node curr = head.next;
		while (curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
