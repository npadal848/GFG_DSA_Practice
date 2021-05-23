package string;

public class CheckIfStringsAreRotations {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";

		String s3 = "ABAAA";
		String s4 = "BAAAA";

		String s5 = "ABAB";
		String s6 = "ABBA";

		System.out.println(checkRotation1(s1, s2));
		System.out.println(checkRotation1(s3, s4));
		System.out.println(checkRotation1(s5, s6));
		System.out.println("===============");
		System.out.println(checkRotation2(s1, s2));
		System.out.println(checkRotation2(s3, s4));
		System.out.println(checkRotation2(s5, s6));
	}

//	Time: Theta(n^2) and Space: O(n)
	static boolean checkRotation1(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int n = s1.length();
		for (int i = 0; i < n; i++) {
			StringBuilder rotateString = new StringBuilder();
			for (int j = 0; j < n; j++) {
				rotateString.append(s1.charAt((i + j) % n));
			}
			if (rotateString.toString().equals(s2))
				return true;
		}
		return false;
	}

//	Time: Theta(n) and Space: O(1)
	static boolean checkRotation2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		return (s1 + s1).indexOf(s2) >= 0;
	}
}
