package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonPrimitiveElementSort {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 0, 3, 4, 5 };

		Arrays.sort(arr, Collections.reverseOrder());
		print(arr);

		Arrays.sort(arr);
		print(arr);

		System.out.println("===== Collection Sort =======");
		Integer[] arr2 = { 0, 3, 4, 5, 2, 1 };
		List<Integer> nums = new ArrayList<>(Arrays.asList(arr2));
		Collections.sort(nums);
		System.out.println(nums);
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
	}

	static void print(Integer[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
}
