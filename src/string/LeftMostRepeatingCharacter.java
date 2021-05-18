package string;

public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks"; // O/P: 0
		String s2 = "abbcc"; // O/P: 1
		String s3 = "abcd"; // O/P: -1

		System.out.println(find1(s1));
		System.out.println(find1(s2));
		System.out.println(find1(s3));
		System.out.println();
		System.out.println(find2(s1));
		System.out.println(find2(s2));
		System.out.println(find2(s3));
	}

//	TC - O(n^2) and SC - O(1)
	static int find1(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return i;
			}
		}
		return -1;
	}

//	TC - O(n) and SC - O(1)
	static int find2(String s) {
		int[] count = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] > 1)
				return i;
		}
		return -1;
	}

//	TC - O(n) and SC - O(1)
	static int find3(String s) {
		int[] count = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
			if (count[s.charAt(i)] > 1)
				return i;

		}
		return -1;
	}
}
