package linkedList.singly;

public class DeleteNodeWithOnlyPointerGivenToIt {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		deleteNode(head.next.next);
		head.print();
		deleteNode(head.next.next);
		head.print();
	}

//	Time: O(1) Note: it will work for node 0 to n-1, not work for lastNode 
	private static void deleteNode(Node deleteNode) {
		deleteNode.data = deleteNode.next.data;
		deleteNode.next = deleteNode.next.next;
	}
}
