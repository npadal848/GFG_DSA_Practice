package string;

public class ReverseWordInAString {

	public static void main(String[] args) {
		String s1 = "Welcome to GFG";
		String s2 = "I Love Codeing";
		String s3 = "ABC";

		System.out.println(reverseWord1(s1));
		System.out.println(reverseWord1(s2));
		System.out.println(reverseWord1(s3));
		System.out.println();
		System.out.println(reverseWord2(s1.toCharArray()));
		System.out.println(reverseWord2(s2.toCharArray()));
		System.out.println(reverseWord2(s3.toCharArray()));
	}

//	Theta(n) and SC - Theat(words)
	static String reverseWord1(String str) {
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i] + " ");
		}
		return sb.toString();
	}

//	Theta(n) and SC - O(1)
	static String reverseWord2(char[] str) {
		int start = 0;
		for (int end = 0; end < str.length; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}
		reverse(str, start, str.length - 1);
		reverse(str, 0, str.length - 1);
		return new String(str);
	}

	static void reverse(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}
}
