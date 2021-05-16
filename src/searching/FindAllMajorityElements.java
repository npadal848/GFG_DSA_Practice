package searching;

import java.util.ArrayList;
import java.util.List;

public class FindAllMajorityElements {

	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 2, 9, 7, 2, 8, 8 };
		int[] arr2 = { 3, 2, 3 };
		int[] arr3 = { 1 };
		List<Integer> nums1 = majorityElement(arr1);
		nums1.forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		List<Integer> nums2 = majorityElement(arr2);
		nums2.forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		List<Integer> nums3 = majorityElement(arr3);
		nums3.forEach(num -> System.out.print(num + " "));

	}

	static List<Integer> majorityElement(int[] nums) {
		List<Integer> candidates = new ArrayList<>();
		int size = nums.length;

		int count1 = 0;
		int count2 = 0;
		Integer candidate1 = null;
		Integer candidate2 = null;

		for (int num : nums) {
			if (candidate1 != null && candidate1 == num) {
				count1++;
			} else if (candidate2 != null && candidate2 == num) {
				count2++;
			} else if (count1 == 0) {
				candidate1 = num;
				count1++;
			} else if (count2 == 0) {
				candidate2 = num;
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;

		for (int num : nums) {
			if (candidate1 != null && candidate1 == num) {
				count1++;
			} else if (candidate2 != null && candidate2 == num) {
				count2++;
			}
		}

		if (count1 > (size / 3))
			candidates.add(candidate1);
		if (count2 > (size / 3))
			candidates.add(candidate2);

		return candidates;
	}
}
