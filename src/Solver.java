
public class Solver {

	static final int GRID_SIZE = Board.getGridSize();

	int[][] board = Board.getBoard();

	// use recursion to solve board
	protected static boolean solveBoard(int[][] board) {
		// loop through each number in board
		for (int row = 0; row < GRID_SIZE; row++) {
			for (int column = 0; column < GRID_SIZE; column++) {
				// if a 0 is found in the board:
				if (board[row][column] == 0) {
					// attempt to insert a number into place where 0 was found
					for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
						// check if placement is valid for the numberToTry
						if (PlacementChecker.isValidPlacement(board, numberToTry, row, column)) {
							// if placement is valid, replace previous number with numberToTry
							board[row][column] = numberToTry;

							// Call solveBoard, passing the updated board
							// continue calling solveBoard board until board is completely solved,
							// or until no numbers 1-9 can be placed in a certain slot.
							// Then, return false, which will cause the solving to backtrack.
							if (solveBoard(board)) {
								return true;
							} else {
								board[row][column] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
}
