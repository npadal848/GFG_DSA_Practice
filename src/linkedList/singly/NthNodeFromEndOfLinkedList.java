package linkedList.singly;

public class NthNodeFromEndOfLinkedList {

	public static void main(String[] args) {
		Node head = null;
		nthNode1(head, 1);
		nthNode2(head, 1);
		System.out.println();
		head = new Node(10);
		head.print();
		nthNode1(head, 1);
		nthNode2(head, 1);
		System.out.println();
		head.next = new Node(20);
		head.print();
		nthNode1(head, 2);
		nthNode2(head, 2);
		System.out.println();
		Node temp1 = new Node(30);
		Node temp2 = new Node(40);
		Node temp3 = new Node(50);
		Node temp4 = new Node(60);
		head.next.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		head.print();
		nthNode1(head, 4);
		nthNode2(head, 4);
		System.out.println();
	}

//	Time: O(n)
	static void nthNode1(Node head, int k) {
		if (head == null)
			return;
		int size = 0;
		for (Node curr = head; curr != null; curr = curr.next)
			size++;
		if (k > size)
			return;
		Node kthNode = head;
		for (int i = 1; i < size - k + 1; i++)
			kthNode = kthNode.next;
		System.out.println(kthNode.data);
	}

//	Time: O(n) // Improved solution
	static void nthNode2(Node head, int k) {
		if (head == null)
			return;
		Node fast = head;
		for (int i = 0; i < k; i++) {
			if (fast == null)
				return;
			fast = fast.next;
		}
		Node slow = head;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(slow.data);
	}
}
