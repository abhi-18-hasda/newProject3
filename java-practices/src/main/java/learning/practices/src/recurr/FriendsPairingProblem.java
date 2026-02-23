package learning.practices.src.recurr;

public class FriendsPairingProblem {
	public static void main(String args[]) {
		System.out.println(findPairs(4));
	}

	private static int findPairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		}

		// for single
		int nm1 = findPairs(n - 1);

		// for double pairs
		int nm2 = findPairs(n - 2);
		// pairs way
		int pairWays = (n - 1) * nm2;
		int totalWays = nm1 + pairWays;
		return totalWays;
		//single line return findPairs(n - 1) + (n - 1) * findPairs(n - 2);
	}
}
