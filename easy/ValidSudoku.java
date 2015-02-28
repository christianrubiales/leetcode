public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        boolean[] set;
        
        // check rows
        for (int i = 0; i < board.length; i++) {
            set = new boolean[10];
            for (int j = 0; j < board[i].length; j++) {
            	if (board[i][j] != '.') {
            		if (set[board[i][j] - '0']) {
	            		return false;
	            	} else {
	            		set[board[i][j] - '0'] = true;
	            	}
            	}
            }
        }

        // check columns
        for (int i = 0; i < board.length; i++) {
            set = new boolean[10];
            for (int j = 0; j < board[i].length; j++) {
            	if (board[j][i] != '.') {
            		if (set[board[j][i] - '0']) {
	            		return false;
	            	} else {
	            		set[board[j][i] - '0'] = true;
	            	}
            	}
            }
        }
        
        // check sub-grid
        int sub = board.length / 3;
        for (int i = 0; i < sub; i++) {
            for (int j = 0; j < sub; j++) {
                set = new boolean[10];
                for (int m = 0; m < sub ; m++) {
                    for (int n = 0; n < sub ; n++) {
                    	if (board[3*i+m][3*j+n] != '.') {
                    		if (set[board[3*i+m][3*j+n] - '0']) {
        	            		return false;
        	            	} else {
        	            		set[board[3*i+m][3*j+n] - '0'] = true;
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
