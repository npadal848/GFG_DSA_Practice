package linkedList;

import java.util.List;
import java.util.stream.Collectors;

public class ReplaceCharWithGivenString {

	public static void main(String[] args) {
		String str = "ancxdexs";
		System.out.println(replace(str, 'y'));
	}

	static String replace(String str, char repl) {
		List<Character> list = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
		for (int i = 0; i < list.size();) {
			if (list.get(i) == 'x') {
				list.set(i, repl);
				int j = i+1;
				while (j < 4 + i) {
					list.add(i, repl);
					j++;
				}
				i+=4;
			}else
				i++;
		}
		return list.toString();
	}
}
