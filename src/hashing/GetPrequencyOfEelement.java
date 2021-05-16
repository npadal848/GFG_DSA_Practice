package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class GetPrequencyOfEelement {

	public static void main(String[] args) {
		int[] arr = { 50, 50, 10, 40, 10 };
		int n = arr.length;

		countFrequency(arr, n);
	}

	static void countFrequency(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.stream(arr).forEach(ele -> map.put(ele, map.getOrDefault(ele, 0) + 1));
		map.keySet().stream().forEach(key -> System.out.println(key + " : " + map.get(key)));
	}
}
