package learning.practices.src.recurr;

public class RemoveDuplicateString {
	public static void main(String args[]) {
		String data = "apnacollage";
		System.out.println(removeDuplicates(data, 0, new StringBuilder(""), new boolean[26]));
	}

	private static String removeDuplicates(String str, int idx, StringBuilder sb, boolean[] map) {
		if (idx == str.length()) {
			return sb.toString();
		}

		char currStr = str.charAt(idx);
		if (map[currStr - 'a'] == true) {
			removeDuplicates(str, idx + 1, sb, map);
		} else {
			map[currStr - 'a'] = true;
			removeDuplicates(str, idx + 1, sb.append(currStr), map);
		}
		return sb.toString();
	}
}
