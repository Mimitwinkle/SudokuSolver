
public class Main {
	static final int GRID_SIZE = Board.getGridSize();

	public static void main(String[] args) {
		int[][] board = Board.getBoard();

		printBoard(board);

		if (Solver.solveBoard(board)) {
			System.out.println("Solved!");
		} else {
			System.out.println("The board is unsolvable.");
		}
		printBoard(board);
	}

	private static void printBoard(int[][] board) {
		for (int row = 0; row < GRID_SIZE; row++) {
			if (row % 3 == 0 && row != 0) {
				System.out.println("-----------");
			}
			for (int column = 0; column < GRID_SIZE; column++) {
				if (column % 3 == 0 && column != 0) {
					System.out.print("|");
				}
				System.out.print(board[row][column]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
