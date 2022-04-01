
public class Board {
	
	private static final int GRID_SIZE = 9;

	static int[][] board = {
			{7, 0, 2, 0, 5, 0, 6, 0, 0},
	        {0, 0, 0, 0, 0, 3, 0, 0, 0},
	        {1, 0, 0, 0, 0, 9, 5, 0, 0},
	        {8, 0, 0, 0, 0, 0, 0, 9, 0},
	        {0, 4, 3, 0, 0, 0, 7, 5, 0},
	        {0, 9, 0, 0, 0, 0, 0, 0, 8},
	        {0, 0, 9, 7, 0, 0, 0, 0, 5},
	        {0, 0, 0, 2, 0, 0, 0, 0, 0},
	        {0, 0, 7, 0, 4, 0, 2, 0, 3} 
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
