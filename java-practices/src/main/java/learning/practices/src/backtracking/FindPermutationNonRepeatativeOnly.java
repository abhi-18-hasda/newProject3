package learning.practices.src.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPermutationNonRepeatativeOnly {
	public static void main(String args[]) {
		int[] nums = { 1, 1, 2 };
		System.out.println(permuteUnique(nums));
	}

	private static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		boolean[] used = new boolean[nums.length];
		backtrack(nums, new ArrayList<Integer>(), used, result);
		return result;
	}

	private static void backtrack(int[] nums, List<Integer> temp, boolean[] used, List<List<Integer>> result) {
		if (temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}

			if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
				continue;
			}

			// choose
			used[i] = true;
			temp.add(nums[i]);

			// explore
			backtrack(nums, temp, used, result);

			// un-choose backtrack
			used[i] = false;
			temp.remove(temp.size() - 1);
		}

	}
}
