package learning.practices.src.javascenariobasedquestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collection_8_MoreSoldProduct_scenario {
	public static void main(String args[]) {
		List<Integer> sales = Arrays.asList(101, 102, 101, 103, 101, 102, 103, 103, 103);
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int num : sales) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int max = Integer.MIN_VALUE, maxKey = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (max <= entry.getValue()) {
				maxKey = entry.getKey();
				max = entry.getValue();
			}
		}
		System.out.println("Product is: " + maxKey + ", Max sale: " + max);
	}
}
