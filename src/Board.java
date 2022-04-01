
public class Board {
	
	private static final int GRID_SIZE = 9;

	static int[][] board = {
			{5, 0, 3, 0, 8, 9, 4, 2, 0},
	        {2, 0, 8, 0, 3, 4, 0, 9, 0},
	        {4, 0, 9, 0, 2, 6, 3, 0, 0},
	        {6, 3, 5, 4, 9, 1, 2, 8, 7},
	        {0, 4, 0, 8, 7, 3, 6, 0, 0},
	        {1, 8, 7, 6, 5, 2, 9, 3, 4},
	        {7, 2, 1, 3, 6, 8, 5, 0, 9},
	        {3, 5, 4, 9, 0, 7, 8, 6, 2},
	        {8, 9, 6, 0, 4, 5, 0, 0, 3} 
	};


	public static int getGridSize() {
		return GRID_SIZE;
	}


	public static int[][] getBoard() {
		return board;
	}


	public void setBoard(int[][] board) {
		this.board = board;
	}
}
