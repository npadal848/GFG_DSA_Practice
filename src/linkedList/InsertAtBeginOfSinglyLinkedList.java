package linkedList;

public class InsertAtBeginOfSinglyLinkedList {

	public static void main(String[] args) {
		Node head=null;
		
		// insert at beginning of node
		head=insertBegin(head, 14);
		head=insertBegin(head, 13);
		head=insertBegin(head, 12);
		head=insertBegin(head, 11);
		head.print();
	}
	
	static Node insertBegin(Node head, int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		return newNode;
	}
}
