package string.patternsearching;

public class PatternSearchingNaiveSol {

	public static void main(String[] args) {
		String txt1 = "ABABABCD";
		String pat1 = "ABAB";

		String txt2 = "ABCABCD";
		String pat2 = "ABCD";

		String txt3 = "AAAAA";
		String pat3 = "AAA";

		patternSearch(txt1, pat1);
		patternSearch(txt2, pat2);
		patternSearch(txt3, pat3);
	}

//	TC - O((n-m+1)m) and SC - O(1)
	static void patternSearch(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		for (int i = 0; i <= n-m; i++) {
			int j;
			for (j = 0; j < pat.length(); j++) {
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
			}
			if (j==m)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
