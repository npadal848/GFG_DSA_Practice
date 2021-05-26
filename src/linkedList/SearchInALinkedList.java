package linkedList;

public class SearchInALinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		System.out.println(search1(head, 10));
		System.out.println(search1(head, 110));
		System.out.println();
		System.out.println(search2(head, 40));
	}

	// Iterative
	static int search1(Node head, int data) {
		int count = 1;
		Node curr = head;
		while (curr != null && curr.data != data) {
			curr = curr.next;
			count++;
		}
		if (curr == null)
			return -1;
		return count;
	}

	// Recursive
	static int search2(Node head, int data) {
		if (head == null)
			return -1;
		if (head.data == data)
			return 1;
		else {
			int res = search2(head.next, data);
			if (res == -1)
				return -1;
			else
				return res + 1;
		}

	}
}
