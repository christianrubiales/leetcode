import java.util.Arrays;

public class SearchSortedMatrix {
	
	// O(log(r*c)) or O(log(r) + log(c))
    public static boolean searchMatrix(int[][] matrix, int target) {
    		return false;
    }
	
	// O(r + log(c)), for 8x8 matrix : 11
    public static boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][matrix[i].length-1]) {
                return Arrays.binarySearch(matrix[i], target) > -1;
            }
        }
        
        return false;
    }

}
