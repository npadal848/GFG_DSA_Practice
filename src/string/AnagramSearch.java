package string;

public class AnagramSearch {

	public static void main(String[] args) {
		String txt1 = "geeksforgeeks";
		String pat1 = "frog";

		String txt2 = "geeksforgeeks";
		String pat2 = "rseek";

		System.out.println(anagramSearch1(txt1, pat1));
		System.out.println(anagramSearch1(txt2, pat2));
		System.out.println("============");
		System.out.println(anagramSearch2(txt1, pat1));
		System.out.println(anagramSearch2(txt2, pat2));
	}

//	Time: O((n-m+1)*m) and O(1)
	static boolean anagramSearch1(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		for (int i = 0; i < n - m; i++) {
			if (isAnagram(txt, pat, i))
				return true;
		}
		return false;
	}

	static boolean isAnagram(String txt, String pat, int i) {
		int[] count = new int[256];
		for (int j = 0; j < pat.length(); j++) {
			count[pat.charAt(j) - 'a']++;
			count[txt.charAt(i + j) - 'a']--;
		}
		for (int j = 0; j < count.length; j++) {
			if (count[j] != 0)
				return false;
		}
		return true;
	}

//	Time: O(n) and O(1)
	static boolean anagramSearch2(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		int txtSum = 0;
		int patSum = 0;
		for (int i = 0; i < m; i++) {
			txtSum += txt.charAt(i);
			patSum += pat.charAt(i);
		}

		for (int j = 1; j <= n - m; j++) {
			if (txtSum == patSum)
				return true;
			txtSum = (txtSum - txt.charAt(j - 1)) + txt.charAt(j + (m - 1));
		}
		return false;
	}
}
