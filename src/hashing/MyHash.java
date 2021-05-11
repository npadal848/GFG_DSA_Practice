package hashing;

public class MyHash {

	int[] arr;
	int cap;
	int size;

	public MyHash() {
	}

	public MyHash(int cap) {
		this.cap = cap;
		size = 0;
		for (int i = 0; i < cap; i++) {
			arr[i] = -1;
		}
	}

	int hash(int key) {
		return key % cap;
	}

	boolean search(int key) {
		int h = hash(key);
		int i = h;

		while (arr[i] != -1) {
			if (arr[i] == key)
				return true;
			i = (i + 1) % cap;
			if (i == h)
				return false;
		}
		return false;
	}

	boolean insert(int key) {
		int h = hash(key);
		int i = h;

		if (arr[i] == -1) {
			arr[i] = key;
			size++;
			return true;
		}
		while (arr[i] != -1) {
			i = (i + 1) % cap;
			if(arr[i]!=-1) {
				
			}
		}
		return false;
	}

	boolean delete(int key) {

		return false;
	}
}
