package linkedList.singly;

import java.util.Scanner;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		Node head1 = new Node(-1);
		Node curr1 = head1;
		while (n1-- > 0) {
			curr1.next = new Node(sc.nextInt());
			curr1 = curr1.next;
		}
		head1 = head1.next;
		int n2 = sc.nextInt();
		Node head2 = new Node(-1);
		Node curr2 = head2;
		while (n2-- > 0) {
			curr2.next = new Node(sc.nextInt());
			curr2 = curr2.next;
		}
		head2 = head2.next;
		head1.print();
		head2.print();
		Node head = merge(head1, head2);
		head.print();
		sc.close();
	}

	private static Node merge(Node head1, Node head2) {
		Node a = head1;
		Node b = head2;
		Node tail = null;
		Node head = null;
		if (a.data > b.data) {
			head = b;
			tail = b;
			b = b.next;
		} else {
			head = a;
			tail = a;
			a = a.next;
		}

		while (a != null && b != null) {
			if (a.data <= b.data) {
				tail.next = a;
				tail = tail.next;
				a = a.next;
			} else {
				tail.next = b;
				tail = tail.next;
				b = b.next;
			}
		}
		if (a == null)
			tail.next = b;
		else
			tail.next = a;
		return head;
	}
}
