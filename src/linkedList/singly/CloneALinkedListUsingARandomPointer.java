package linkedList.singly;

import java.util.HashMap;
import java.util.Map;

public class CloneALinkedListUsingARandomPointer {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(5);
		Node temp2 = new Node(20);
		Node temp3 = new Node(15);
		Node temp4 = new Node(20);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;

		head.random = temp2;
		temp1.random = temp3;
		temp2.random = head;
		temp3.random = temp2;
		temp4.random = temp3;

		head.print();
		head = clone1(head);
		head.print();
		System.out.println();
		head = clone2(head);
		head.print();
	}

//	Time: O(n) and Space: O(n)
	private static Node clone1(Node head) {
		Map<Node, Node> map = new HashMap<>();
		Node curr = null;

		for (curr = head; curr != null; curr = curr.next) {
			map.put(curr, new Node(curr.data));
		}
		curr = head;
		Node head2 = null;
		while (curr != null) {
			Node cloneCurr = map.get(curr);
			cloneCurr.next = map.get(curr.next);
			cloneCurr.random = map.get(curr.random);
			curr = curr.next;
		}
		head2 = map.get(head);
		return head2;
	}

//	Time: O(n) and Space: O(1)
	private static Node clone2(Node head) {

		Node curr = head;
		// Add new node in next of each node
		while (curr != null) {
			Node next = curr.next;
			curr.next = new Node(curr.data);
			curr.next.next = next;
			curr = next;
		}

		// Connect each new node to their random nodes
		curr = head;
		while (curr != null) {
			Node next = curr.next.next;
			Node newNextNode = curr.next;
			newNextNode.random = curr.random;
			curr = next;
		}
		Node newHead = head.next; // copy new head 
		curr = head;
		
		// disconnect old node and new node and connect to respected nodes
		while (curr != null) {
			Node next = curr.next.next;
			Node newNextNode = curr.next;
			curr.next = next;
			newNextNode.next = (next != null) ? next.next : null;
			curr = curr.next;
		}
		return newHead;
	}
}
