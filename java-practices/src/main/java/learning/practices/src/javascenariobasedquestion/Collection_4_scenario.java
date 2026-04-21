package learning.practices.src.javascenariobasedquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection_4_scenario {
	public static void main(String args[]) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Mahesh", 85);
		scores.put("NTR", 95);
		scores.put("Charan", 92);
		scores.put("Prabhas", 88);
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(scores.entrySet());
		Collections.sort(list, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			Map.Entry<String, Integer> ans = list.get(i);
			System.out.println(ans.getKey() + " " + ans.getValue());
		}
	}
}
