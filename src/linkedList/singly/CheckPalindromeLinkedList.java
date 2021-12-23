package linkedList.singly;

import java.util.Scanner;

public class CheckPalindromeLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node head = new Node(-1);
		Node curr = head;
		while (n-- > 0) {
			curr.next = new Node(sc.nextInt());
			curr = curr.next;
		}
		head = head.next;
		System.out.println(isPalindrome(head));
	}

	private static boolean isPalindrome(Node head) {
		if (head == null || head.next == null)
			return true;
		Node slow = head;
		Node fast = head.next.next;
		if (fast == null) {
			if (head.data != head.next.data)
				return false;
			else
				return true;
		}

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node curr = slow.next;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		Node firstHalfCurrtNode = head;
		Node secondHalfCurrtNode = prev;
		while (secondHalfCurrtNode != null) {	
			if (firstHalfCurrtNode.data != secondHalfCurrtNode.data)
				return false;
			firstHalfCurrtNode = firstHalfCurrtNode.next;
			secondHalfCurrtNode = secondHalfCurrtNode.next;
		}
		return true;
	}
}
