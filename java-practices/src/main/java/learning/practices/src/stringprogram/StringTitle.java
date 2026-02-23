package learning.practices.src.stringprogram;

public class StringTitle {
	public static void main(String args[]) {
		String title = "First leTTeR off EACH Word";
		System.out.println(capitalizeTitle(title));
	}

	public static String capitalizeTitle(String title) {
		StringBuilder sb = new StringBuilder("");
		String[] words = title.split(" ");
		for (String word : words) {
			if (word.length() <= 2) {
				sb.append(word.toLowerCase());
			} else {
				sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
