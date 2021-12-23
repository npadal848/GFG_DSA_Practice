package stack;

public class MyStackUsingLinkedList {

	Node head;
	int size;

	public MyStackUsingLinkedList() {
	}

	public static void main(String[] args) {
		MyStackUsingLinkedList stack = new MyStackUsingLinkedList();

		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());

		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.print();
		System.out.println(stack.isEmpty());

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println();
		stack.print();
//		stack.push(50);
//		stack.push(31);
//		stack.push(45);
//		stack.push(55);
//		stack.print();
	}

	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		size++;
	}

	public int pop() {
		if (head == null)
			return Integer.MAX_VALUE;
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public int peek() {
		if (head == null)
			return Integer.MAX_VALUE;
		int data = head.data;
		return data;
	}

	public int size() {
		return size;
	}

	boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void print() {
		for (Node curr = this.head; curr != null; curr = curr.next) {
			System.out.print(curr.data + " ");
		}
		System.out.println();
	}
}
