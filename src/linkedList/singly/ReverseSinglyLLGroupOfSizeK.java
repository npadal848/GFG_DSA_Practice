package linkedList.singly;

import java.util.Scanner;

public class ReverseSinglyLLGroupOfSizeK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node head = new Node(-1);
		Node curr = head;
		while (n-- > 0) {
			curr.next = new Node(sc.nextInt());
			curr = curr.next;
		}
		int k = sc.nextInt();
		head = head.next;
		head.print();
		System.out.println();
		head = reverseByGroup1(head, k);
		head.print();
//		System.out.println();
//		head = reverseByGroup2(head, 3);
//		head.print();
	}

//	Iterative solution
	static Node reverseByGroup1(Node head, int k) {
		Node curr = head;
		Node prevFirst = null;
		boolean isFirstPass = true;
		int noOfNodes = 0;

		while (curr != null) {
			noOfNodes++;
			curr = curr.next;
		}
		curr = head;
		int noOfPossibleGroups = noOfNodes / k;
		int groupCount = 0;
		while (curr != null) {
			Node prev = null;
			Node first = curr;
			int count = 0;
			while (groupCount < noOfPossibleGroups && curr != null && count < k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if (isFirstPass) {
				head = prev;
				isFirstPass = false;
			} else if (groupCount >= noOfPossibleGroups) {
				prevFirst.next = curr;
				break;
			} else
				prevFirst.next = prev;
			prevFirst = first;
			groupCount++;
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
