package linkedList.singly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import sorting.MergeSort3;

public class SortALinkedList {

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
		head.print();
		head = sort(head);
		head.print();
	}

	static Node sort(Node head) {
		List<Integer> list = new ArrayList<>();
		Node curr = head;
		while (curr != null) {
			list.add(curr.data);
			curr = curr.next;
		}
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		List<Integer> node= new ArrayList<>();
		MergeSort3.mergeSort(arr, 0, arr.length - 1);

		Node newHead = new Node(-1);
		curr = newHead;
		for (int num : arr) {
			curr.next = new Node(num);
			curr = curr.next;
		}
		return newHead.next;
	}
}
