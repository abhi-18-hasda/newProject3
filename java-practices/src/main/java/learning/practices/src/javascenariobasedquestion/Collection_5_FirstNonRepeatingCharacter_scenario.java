package learning.practices.src.javascenariobasedquestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collection_5_FirstNonRepeatingCharacter_scenario {
	public static void main(String args[]) {
		String str = "swiss";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("Ans is: " + entry.getKey());
				return;
			}
		}
		System.out.println("no unique element found");
	}
}
