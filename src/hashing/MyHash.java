package hashing;

import java.util.Arrays;

public class MyHash {

	int[] arr;
	int cap;
	int size;

	public MyHash() {
		this.cap = 10;
		arr = new int[cap];
		for (int i = 0; i < cap; i++) {
			arr[i] = -1;
		}
	}

	public MyHash(int cap) {
		this.cap = cap;
		arr = new int[cap];
		size = 0;
		for (int i = 0; i < cap; i++) {
			arr[i] = -1;
		}
	}

	public static void main(String[] args) {
		MyHash hash = new MyHash();
		System.out.println(hash.insert(12));
		System.out.println(hash.insert(15));
		System.out.println(hash.insert(12));
		System.out.println(hash.insert(23));
		System.out.println(hash.insert(48));
		System.out.println(hash.insert(5));
		System.out.println(hash.insert(9));
		System.out.println(hash.insert(14));
		System.out.println(hash.insert(11));
		System.out.println(hash.insert(56));
		System.out.println(hash.insert(42));
		System.out.println(hash.insert(50));

//		System.out.println(hash.delete(12));
//		System.out.println(hash.delete(96));
		
		System.out.println(hash.search(48));
		System.out.println(hash.search(5));
		
		System.out.println(hash.cap);
		System.out.println(hash.size);

		Arrays.stream(hash.arr).forEach(ele -> System.out.print(ele + " "));
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
		if (size == cap)
			return false;

		int i = hash(key);

		while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
			i = (i + 1) % cap;
		}
		if (arr[i] == key) {
			return false;
		} else {
			arr[i] = key;
			size++;
			return true;
		}
	}

	boolean delete(int key) {
		int h = hash(key);
		int i = h;

		while (arr[i] != -1 && arr[i] != -2) {
			if (arr[i] == key) {
				arr[i] = -2;
				size--;
				return true;
			}
			i = (i + 1) % cap;
			if (i == h) {
				return false;
			}
		}
		return false;
	}
}
