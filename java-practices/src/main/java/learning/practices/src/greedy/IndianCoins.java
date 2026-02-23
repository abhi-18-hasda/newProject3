package learning.practices.src.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IndianCoins {

	public static int findMin(int amount) {
		List<Integer> box = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 500, 2000);
		box.sort(Comparator.reverseOrder());
		int count = 0;
		if (amount == 0) {
			return 0;
		}

		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < box.size(); i++) {
			while (box.get(i) <= amount) {
				count++;
				amount -= box.get(i);
				arr.add(box.get(i));
			}
		}
		arr.stream().forEach(System.out::println);
		return amount == 0 ? count : -1;
	}

	public static void main(String args[]) {
		int amount = 121;
		System.out.println("Total calculated coins: "+findMin(amount));
	}
}
