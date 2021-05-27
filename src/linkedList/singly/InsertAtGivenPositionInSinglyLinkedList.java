package linkedList.singly;

public class InsertAtGivenPositionInSinglyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		
		head=insertAtPosition(head, 15, 2);
		head.print();
		System.out.println();
		head=insertAtPosition(head, 30, 1);
		head.print();
		System.out.println();
		head=insertAtPosition(head, 40, 5);
		head.print();
		System.out.println();
		head=insertAtPosition(head, 25, 5);
		head.print();
//		System.out.println(head.size());
	}

	static Node insertAtPosition(Node head, int data, int pos) {
		if (head == null)
			return head;
		if (pos > head.size()+1)
			return head;
		Node temp = new Node(data);
		if(pos==1) {
			temp.next=head;
			return temp;
		}
		int count = 1;
		Node curr = head;
		while (curr != null && count <= pos - 2) {
			curr = curr.next;
			count++;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
}
