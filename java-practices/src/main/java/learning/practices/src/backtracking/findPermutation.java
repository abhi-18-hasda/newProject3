package learning.practices.src.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findPermutation {
	public static void findPer(String str, String ans, Set<String> val) {
		if (str.length() == 0) {
			val.add(ans);
			// System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i + 1, str.length());
			findPer(newStr, ans + curr, val);
		}
	}

	public static void main(String args[]) {
		String str = "abc";
		String ans = "";
		Set<String> val = new HashSet<String>();
		findPer(str, ans, val);
		List<String> list = new ArrayList<String>(val);
		System.out.println("Print: " + list);

	}
}
