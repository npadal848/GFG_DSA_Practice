package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int[] arr2 = { 1, 1, 2 };
		int[] arr3 = { 1 };

		System.out.println(getDuplicates1(arr1));
		System.out.println(getDuplicates1(arr2));
		System.out.println(getDuplicates1(arr3));
	}

//	Time: O(n) and Space: O(n)
	static List<Integer> getDuplicates1(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 1)
			return list;
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num))
				list.add(num);
		}
		return list;
	}

//	Time: O(n) and Space: O(1)
	static List<Integer> getDuplicates2(int[] nums) {
		List<Integer> res = new ArrayList<>();
		if (nums == null || nums.length == 1)
			return res;
		for (int num : nums) {
			int index = Math.abs(num) - 1;
			if (nums[index] < 0)
				res.add(num);
			else
				nums[index] = -nums[index];
		}
		return res;
	}
}
