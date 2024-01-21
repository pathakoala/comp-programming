import java.io.*;

public class chessboard {
	private static final int DIM = 8;

	private static boolean[][] blocked = new boolean[DIM][DIM];

	private static final boolean[] rowsTaken = new boolean[DIM];
	// Indicators for diagonals that go from the bottom left to the top right
	private static final boolean[] diag1 = new boolean[DIM * 2 - 1];
	// Indicators for diagonals that go from the bottom right to the top left
	private static final boolean[] diag2 = new boolean[DIM * 2 - 1];

	private static int validNum = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader read =
		    new BufferedReader(new InputStreamReader(System.in));
		for (int r = 0; r < DIM; r++) {
			String row = read.readLine();
			for (int c = 0; c < DIM; c++) {
				if (row.charAt(c) == '*') { blocked[r][c] = true; }
			}
		}

		searchQueens(0);

		System.out.println(validNum);
	}

	private static void searchQueens(int c) {
		if (c == DIM) {
			// We've filled all rows, increment and return
			validNum++;
			return;
		}

		for (int r = 0; r < DIM; r++) {
			boolean row_open = !rowsTaken[r];
			boolean diag_open = !diag1[r + c] && !diag2[r - c + DIM - 1];
			if (!blocked[r][c] && row_open && diag_open) {
				// A row and two diagonals have been taken
				rowsTaken[r] = diag1[r + c] = diag2[r - c + DIM - 1] = true;
				searchQueens(c + 1);
				// And now they aren't anymore
				rowsTaken[r] = diag1[r + c] = diag2[r - c + DIM - 1] = false;
			}
		}
	}
}