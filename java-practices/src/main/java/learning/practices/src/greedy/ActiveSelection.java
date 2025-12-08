package learning.practices.src.greedy;

import java.util.ArrayList;
import java.util.List;

public class ActiveSelection {
	public static void main(String args[]) {
		int[] start = { 1, 3, 0, 5, 8, 5 };
		int[] end = { 2, 4, 6, 7, 9, 9 };

		int maxAt = 1;
		List<Integer> workPick = new ArrayList<Integer>();
		workPick.add(0);
		int lastEnd = end[0];
		for (int i = 0; i < end.length; i++) {
			if (start[i] >= lastEnd) {
				maxAt++;
				workPick.add(i);
				lastEnd = end[i];
			}
		}
		System.out.println("max picked work: " + maxAt);
		for (int i = 0; i < workPick.size(); i++) {
			System.out.print("A" + workPick.get(i) + ", ");
		}
		System.out.println();
	}
}
