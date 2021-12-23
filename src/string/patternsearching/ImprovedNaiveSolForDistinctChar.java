package string.patternsearching;

public class ImprovedNaiveSolForDistinctChar {

	public static void main(String[] args) {
		String txt1 = "ABCEABEFABCD";
		String pat1 = "ABCD";

		String txt2 = "GEEKSFORGEEKS";
		String pat2 = "EKS";

		String txt3 = "ABCAAAD";
		String pat3 = "ABD";

		patternSearch(txt1, pat1);
		patternSearch(txt2, pat2);
		patternSearch(txt3, pat3);
	}

//	TC - O(n) and SC - O(1)
	static void patternSearch(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		for (int i = 0; i <= n - m;) {
			int j;
			for (j = 0; j < m; j++) {
				if (txt.charAt(i + j) != pat.charAt(j))
					break;
			}
			if (j == m)
				System.out.print(i + " ");
			if (j == 0)
				i++;
			else
				i = (i + j);
		}
		System.out.println();
	}
}
