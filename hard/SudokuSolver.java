
// @see https://discuss.leetcode.com/topic/11327/straight-forward-java-solution-using-backtracking
public class SudokuSolver {

	static void solveSudoku(char[][] board) {
		if (board == null || board.length == 0)
			return;
		solve(board);
	}

	static boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					for (char c = '1'; c <= '9'; c++) {
						if (isValid(board, i, j, c)) {
							board[i][j] = c;

							if (solve(board)) {
								return true;
							} else {
								board[i][j] = '.';
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	static boolean isValid(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == c) {
				return false;
			}
			if (board[row][i] == c) {
				return false;
			}
			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = {
				"53..7....".toCharArray(), 
				"6..195...".toCharArray(), 
				".98....6.".toCharArray(),
				"8...6...3".toCharArray(), 
				"4..8.3..1".toCharArray(), 
				"7...2...6".toCharArray(),
				".6....28.".toCharArray(), 
				"...419..5".toCharArray(), 
				"....8..79".toCharArray()
		};
		
		solve(board);
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
