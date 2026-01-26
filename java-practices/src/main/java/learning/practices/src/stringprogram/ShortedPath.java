package learning.practices.src.stringprogram;

import java.util.HashSet;
import java.util.Set;

public class ShortedPath {
	public static void main(String args[]) {
		String path = "NES";
		System.out.println(isPathCrossing(path));

	}

	public static boolean isPathCrossing(String path) {
		Set<String> visited = new HashSet<>();
		visited.add(0 + "," + 0);
		int x = 0;
		int y = 0;
		int i = 0;
		while (i < path.length()) {
			char ch = path.charAt(i);
			if (ch == 'N')
				y++;
			if (ch == 'S')
				y--;
			if (ch == 'E')
				x++;
			if (ch == 'W')
				x--;
			String key = x + "," + y;
			if (visited.contains(key)) {
				return true;
			}
			visited.add(key);
			i++;
		}
		return false;

	}
}
