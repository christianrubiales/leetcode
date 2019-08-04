import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementInASortedMatrixUsingSorting {

    public static int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }
//        Collections.sort(list);
        return list.get(k-1);
    }
    
    public static void main(String[] args) {
    	int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
    	
    	System.out.println(kthSmallest(matrix, 4));
    	System.out.println(kthSmallest(matrix, 11));
    }
}
