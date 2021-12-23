package linkedList.doubly;

public class InsertAtBeginning {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		head.print();
		System.out.println();
		head=insertAtBeginning(head, 50);
		head.print();
	}

	static Node insertAtBeginning(Node head, int data) {
		if (head == null)
			return head;
		Node temp = new Node(data);
		temp.next = head;
		head.prev = temp;
		return temp;
	}
}
