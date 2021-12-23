package linkedList.singly;

public class ImplSinglyLinkedList {

	public static void main(String[] args) {
		Node head=new Node(12);
		Node node1=new Node(13);
		Node node2=new Node(14);
		head.next=node1;
		node1.next=node2;

		head.print();
	}
	
}
