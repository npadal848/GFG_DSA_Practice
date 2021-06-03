package linkedList.singly;

public class ReverseSinglyLLGroupOfSizeK {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);
		Node temp4 = new Node(5);
		Node temp5 = new Node(6);
		Node temp6 = new Node(7);
		Node temp7 = new Node(8);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = temp6;
		temp6.next = temp7;
		head.print();
		System.out.println();
//		head = reverseByGroup1(head, 3);
//		head.print();
//		System.out.println();
		head = reverseByGroup2(head, 3);
		head.print();
	}

//	Iterative solution
	static Node reverseByGroup1(Node head, int k) {
		Node curr = head;
		Node prevFirst = null;
		boolean isFirstPass = true;
		while (curr != null) {
			Node prev = null;
			Node first = curr;
			int count = 0;

			while (curr != null && count < k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if (isFirstPass) {
				head = prev;
				isFirstPass = false;
			} else
				prevFirst.next = prev;
			prevFirst = first;
		}
		return head;
	}

//	Recursive solution
	static Node reverseByGroup2(Node head, int k) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		int count = 0;

		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if (next != null) {
			Node restHead = reverseByGroup2(next, k);
			head.next = restHead;
		}
		return prev;
	}
}
