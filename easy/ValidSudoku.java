import java.util.BitSet;


public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        BitSet set;
        
        // check rows
        for (int i = 0; i < board.length; i++) {
            set = new BitSet(9);
            for (int j = 0; j < board[i].length; j++) {
            	if (board[i][j] != '.') {
            		if (set.get(board[i][j])) {
	            		return false;
	            	} else {
	            		set.set(board[i][j]);
	            	}
            	}
            }
        }

        // check columns
        for (int i = 0; i < board.length; i++) {
            set = new BitSet(9);
            for (int j = 0; j < board[i].length; j++) {
            	if (board[j][i] != '.') {
            		if (set.get(board[j][i])) {
	            		return false;
	            	} else {
	            		set.set(board[j][i]);
	            	}
            	}
            }
        }
        
        // check sub-grid
        int sub = board.length / 3;
        for (int i = 0; i < sub; i++) {
            for (int j = 0; j < sub; j++) {
                set = new BitSet(9);
                for (int m = 0; m < sub ; m++) {
                    for (int n = 0; n < sub ; n++) {
                    	if (board[3*i+m][3*j+n] != '.') {
                    		if (set.get(board[3*i+m][3*j+n])) {
        	            		return false;
        	            	} else {
        	            		set.set(board[3*i+m][3*j+n]);
        	            	}
                    	}
                    }
                }
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
		System.out.println(isValidSudoku(new char[][]{"....5..1.".toCharArray(),".4.3.....".toCharArray(),".....3..1".toCharArray(),"8......2.".toCharArray(),
				"..2.7....".toCharArray(),".15......".toCharArray(),".....2...".toCharArray(),".2.9.....".toCharArray(),"..4......".toCharArray()}));
	}

}
