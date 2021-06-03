package linkedList.singly;

public class RemoveDuplicateFromSinglyLL {

	public static void main(String[] args) {
		Node head = null;
		head = removeDuplicates1(head);
		head = new Node(10);
		head.print();
		head = removeDuplicates1(head);
		head.print();
		System.out.println();

		head.next = new Node(20);
		head.next.next = new Node(20);
		head.print();
		head = removeDuplicates1(head);
		head.print();
		System.out.println();

		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(30);
		Node temp4 = new Node(30);
		head.next.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		head.print();
		head = removeDuplicates1(head);
		head.print();
	}

	static Node removeDuplicates1(Node head) {
		if (head == null || head.next == null)
			return head;
		Node curr = head;
		while (curr.next != null) {
			if (curr.data == curr.next.data)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}
		return head;
	}
}
