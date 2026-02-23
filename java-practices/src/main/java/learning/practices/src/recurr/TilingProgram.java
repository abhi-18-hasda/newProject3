package learning.practices.src.recurr;

public class TilingProgram {
	public static void main(String args[]) {
		System.out.println(numTilings(3));
	}

	public static int numTilings(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		int nmf = numTilings(n - 1);
		int nms = numTilings(n - 2);
		int total = nmf + nms;
		return total;
	}
}
