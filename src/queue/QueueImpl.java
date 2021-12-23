package queue;

public class QueueImpl {

	int size = 0;
	int cap = 0;
	int[] queue;
	int front;
	int rear;

	public QueueImpl(int cap) {
		this.cap = cap;
		queue = new int[cap];
	}

	public static void main(String[] args) {
		QueueImpl queue = new QueueImpl(5);
		queue.deque(10);
		queue.deque(20);
		queue.deque(30);
		queue.enque(40);
		queue.enque(50);
		
		queue.print();
	}

	void deque(int data) {
		if (size == 0) {
			queue[front] = data;
			size++;
			return;
		}
		if (isFull())
			return;

		for (int i = size; i >= 0 && !isFull(); i--)
			queue[i + 1] = queue[i];
		queue[front] = data;
		rear++;
		size++;
	}

	void enque(int data) {
		rear++;
		queue[rear] = data;
		size++;
	}

	boolean isFull() {
		return (size == cap);
	}

	void print() {
		for (int num : this.queue)
			System.out.print(num + " ");
		System.out.println();
	}
}
