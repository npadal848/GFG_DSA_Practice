package stack;

public class TwoStack {

	int[] stack;
	int cap;
	int size1;
	int size2;
	int top1;
	int top2;

	public TwoStack(int cap) {
		this.cap = cap;
		stack = new int[cap];
		top1 = -1;
		top2 = cap;
	}

	public static void main(String[] args) {
		TwoStack stack = new TwoStack(5);
		stack.push1(1);
		stack.push1(2);
		stack.push1(3);
		stack.push1(4);
		stack.push2(5);
		System.out.println("Size1: " + stack.size1);
		System.out.println("Size2: " + stack.size2);
		System.out.println();
		System.out.println(stack.peek1());
		System.out.println(stack.pop2());
		System.out.println(stack.peek2());
		System.out.println(stack.isEmpty2());
		System.out.println();
		stack.push2(10);
		stack.pop1();
		System.out.println("Size1: " + stack.size1);
		System.out.println("Size2: " + stack.size2);
	}

	void push1(int data) {
		if (top1 < top2 - 1) {
			top1++;
			stack[top1] = data;
			size1++;
		} else
			return;
	}

	void push2(int data) {
		if (top1 < top2 - 1) {
			top2--;
			stack[top2] = data;
			size2++;
		} else
			return;
	}

	int pop1() {
		if (top1 >= 0) {
			int x = stack[top1];
			top1--;
			size1--;
			return x;
		} else
			return -1;
	}

	int pop2() {
		if (top2 < cap) {
			int x = stack[top2];
			top2++;
			size2--;
			return x;
		} else
			return -1;
	}

	int peek1() {
		if (top1 >= 0) {
			return stack[top1];
		} else
			return -1;
	}

	int peek2() {
		if (top2 < cap) {
			return stack[top2];
		} else
			return -1;
	}

	int size1() {
		if (top1 == -1)
			return 0;
		else
			return size1;
	}

	int size2() {
		if (top2 == cap)
			return 0;
		else
			return size2;
	}

	boolean isEmpty1() {
		if (top1 == -1)
			return true;
		return false;
	}

	boolean isEmpty2() {
		if (top2 == cap)
			return true;
		return false;
	}
}
