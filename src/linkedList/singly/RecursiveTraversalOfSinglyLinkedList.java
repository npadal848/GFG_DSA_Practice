package linkedList.singly;

public class RecursiveTraversalOfSinglyLinkedList {

	public static void main(String[] args) {
		Node head=new Node(12);
		Node node1=new Node(13);
		Node node2=new Node(14);
		Node node3=new Node(30);
		Node node4=new Node(24);
		head.next=node1;
		node1.next=node2;
		node1.next.next=node3;
		node1.next.next.next=node4;

		printList(head);
	}
	
	static void printList(Node node) {
		if(node==null)
			return;
		System.out.println(node.data);
		printList(node.next);
	}
}
