package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplOfHashingChaining {

	int bucket;
	ArrayList<LinkedList<Integer>> bucketList;

	public static void main(String[] args) {
		ImplOfHashingChaining chaining=new ImplOfHashingChaining();
		chaining.hashing(7);

		chaining.insert(70);
		chaining.insert(71);
		chaining.insert(9);
		chaining.insert(56);
		chaining.insert(72);

		System.out.println(chaining.search(8));
		System.out.println(chaining.search(72));

		chaining.delete(72);

		System.out.println(chaining.bucketList);
	}

	void hashing(int b) {
		bucket=b;
		bucketList = new ArrayList<>(bucket);

		for (int i = 0; i < bucket; i++) {
			bucketList.add(new LinkedList<>());
		}
	}

	void insert(int key) {
		int index = key % bucket;
		LinkedList<Integer> list = bucketList.get(index);
		list.add(key);
		bucketList.set(index, list);
	}

	boolean search(int key) {
		int index = key % bucket;
		LinkedList<Integer> list = bucketList.get(index);

		for (int ele : list) {
			if (ele == key)
				return true;
		}
		return false;
	}

	void delete(int key) {
		int index = key % bucket;
		LinkedList<Integer> list = bucketList.get(index);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == key) {
				list.remove(i);
				bucketList.set(index, list);
				break;
			}
		}
	}
}
