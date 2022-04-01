
public class PlacementChecker {

	private static final int GRID_SIZE = Board.getGridSize();

	// check for valid number placement
	protected static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column)
				&& !isNumberInBox(board, number, row, column);
	}

	// check each number in row
	private static boolean isNumberInRow(int[][] board, int number, int row) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[row][i] == number)
				return true;
		}
		return false;
	}

	// check each number in column
	private static boolean isNumberInColumn(int[][] board, int number, int column) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[i][column] == number)
				return true;
		}
		return false;
	}

	// check each number in 3x3 box
	private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
		// find the index of the top row in target box
		int targetBoxRow = row - row % 3;
		// find the index of the left-most column in target box
		int targetBoxColumn = column - column % 3;

		for (int i = targetBoxRow; i < targetBoxRow + 3; i++) {
			for (int j = targetBoxColumn; j < targetBoxColumn + 3; j++) {
				if (board[i][j] == number)
					return true;
			}
		}
		return false;
	}
}
