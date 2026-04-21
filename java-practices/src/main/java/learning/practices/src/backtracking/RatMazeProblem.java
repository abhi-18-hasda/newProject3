package learning.practices.src.backtracking;

public class RatMazeProblem {
	public static void main(String args[]) {
//		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		int[][] maze = {
			    {1, 0, 1, 1},
			    {1, 0, 1, 0},
			    {1, 1, 0, 1},
			    {0, 1, 1, 1}
			};
		solveMaze(maze);
	}

	private static boolean solveMaze(int[][] maze) {
		int n = maze.length;
		int[][] sol = new int[n][n];
		if (solveMazeUtil(maze, 0, 0, sol) == false) {
			System.out.println("Solution not exists");
			return false;
		}
		printSolution(sol);
		return true;

	}

	private static void printSolution(int[][] sol) {
		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol.length; j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		// base case
		if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
			sol[x][y] = 1;
			return true;
		}
		// recursion
		if (isSafe(maze, x, y) == true) {
			// for handle revisit case
			if (sol[x][y] == 1) {
				return false;
			}
			// when not present
			sol[x][y] = 1;

			// go down
			if (solveMazeUtil(maze, x + 1, y, sol)) {
				return true;
			}
			// go right
			if (solveMazeUtil(maze, x, y + 1, sol)) {
				return true;
			}
			// reassign with 0
			sol[x][y] = 0;
			return false;
		}
		return false;
	}

	private static boolean isSafe(int[][] maze, int x, int y) {
		return x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1;
	}
}
