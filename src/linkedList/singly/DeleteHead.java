package linkedList.singly;

public class DeleteHead {

	public static void main(String[] args) {
		Node head = null;
		System.out.println(deleteHead(head));
		head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.print();
		System.out.println("=========");
		head=deleteHead(head);
		head.print();
	}

//	Time: O(1)
	static Node deleteHead(Node head) {
		if (head == null)
			return head;
		return head.next;
	}
}
