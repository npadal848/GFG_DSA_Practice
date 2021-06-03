package linkedList.singly;

import java.util.ArrayList;
import java.util.List;

public class ReverseALinkedListIterative {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head = reverse1(head);
		head.print();
		
		System.out.println();
		
		Node newHead = new Node(10);
		newHead.next = new Node(20);
		newHead.next.next = new Node(30);
		newHead = reverse2(newHead);
		newHead.print();
		System.out.println();
	}

//	Time: O(n) and Space: O(n)
	static Node reverse1(Node head) {
		List<Integer> list = new ArrayList<>();
		for (Node curr = head; curr != null; curr = curr.next) {
			list.add(curr.data);
		}

		for (Node curr = head; curr != null; curr = curr.next) {
			curr.data = list.remove(list.size() - 1);
		}
		return head;
	}

//	Time: O(n) // One traversal
	static Node reverse2(Node head) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
