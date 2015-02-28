import java.util.HashSet;
import java.util.Set;


/**
 * Compare by rows, by columns, and don't forget to compare the sub-grids.
 * Best solution so far is using HashSet, as compared to using BitSet.
 * Using boolean array is the worst of the three, but not by much.
 */
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> set;
        
        // check rows
        for (int i = 0; i < board.length; i++) {
            set = new HashSet<Character>();
            for (int j = 0; j < board[i].length; j++) {
            	if (board[i][j] != '.') {
            		if (set.contains(board[i][j])) {
	            		return false;
	            	} else {
	            		set.add(board[i][j]);
	            	}
            	}
            }
        }

        // check columns
        for (int i = 0; i < board.length; i++) {
            set = new HashSet<Character>();
            for (int j = 0; j < board[i].length; j++) {
            	if (board[j][i] != '.') {
            		if (set.contains(board[j][i])) {
	            		return false;
	            	} else {
	            		set.add(board[j][i]);
	            	}
            	}
            }
        }
        
        // check sub-grid
        int sub = board.length / 3;
        for (int i = 0; i < sub; i++) {
            for (int j = 0; j < sub; j++) {
                set = new HashSet<Character>();
                for (int m = 0; m < sub ; m++) {
                    for (int n = 0; n < sub ; n++) {
                    	if (board[3*i+m][3*j+n] != '.') {
                    		if (set.contains(board[3*i+m][3*j+n])) {
        	            		return false;
        	            	} else {
        	            		set.add(board[3*i+m][3*j+n]);
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
