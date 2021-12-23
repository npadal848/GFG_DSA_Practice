package linkedList.singly;

public class DeleteKthNodeCircularLinkedList {

	public static void main(String[] args) {
		Node head = null;
		head = delete(head, 1);
		PrintCircularLL.printNode(head); // head is null here

		head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		head = delete(head, 2);
		PrintCircularLL.printNode(head);
	}

	static Node delete(Node head, int k) {
		if (head == null)
			return head;
		if (k == 1) {
			return DeleteHeadOfCircularLinkedList.deleteHead2(head);
		}
		int count = 1;
		Node curr = head;
		while (count < k - 1) {
			curr = curr.next;
			count++;
		}
		curr.next = curr.next.next;
		return head;
	}
}
