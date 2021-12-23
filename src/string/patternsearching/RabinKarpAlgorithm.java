package string.patternsearching;

public class RabinKarpAlgorithm {

	static final int d = 256;
	static final int q = 101;

	public static void main(String[] args) {
		String txt1 = "ABABABCD";
		String pat1 = "ABAB";

		String txt2 = "ABCABCD";
		String pat2 = "ABCD";

		String txt3 = "AAAAA";
		String pat3 = "AAA";

		rabinKarpAlgorithm(txt1, pat1);
		rabinKarpAlgorithm(txt2, pat2);
		rabinKarpAlgorithm(txt3, pat3);
	}

	static void rabinKarpAlgorithm(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();

		int h = 1;
		for (int i = 1; i <= m - 1; i++)
			h = (h * d) % q;

		int p = 0;
		int t = 0;
		for (int i = 0; i < m; i++) {
			p = ((p * d) + pat.charAt(i)) % q;
			t = ((t * d) + txt.charAt(i)) % q;
		}

		for (int i = 0; i <= n - m; i++) {
			if (p == t) {
				boolean flag = true;
				for (int j = 0; j < m; j++) {
					if (txt.charAt(i + j) != pat.charAt(j)) {
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.print(i + " ");
			}
			if (i < n - m)
				t = ((d * (t - txt.charAt(i) * h)) + txt.charAt(i + m)) % q;
			if (t < 0)
				t = t + q;
		}
		System.out.println();
	}
}
