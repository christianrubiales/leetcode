public class KthSmallestElementInASortedMatrix {

    public static int kthSmallest(int[][] matrix, int k) {
    	k--;
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	
    	return matrix[k / (rows-1)][k % cols];
    }
    
    public static void main(String[] args) {
    	int[][] matrix = {{1,2,3,4,5,6,7,8,9,10,11,12}};
    	
//    	System.out.println(kthSmallest(matrix, 4));
//    	System.out.println(kthSmallest(matrix, 11));
//    	for (int i = 1; i <= 12; i++) {
//    		System.out.println(kthSmallest(matrix, i));
//    	}
    	
    	matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
    	
    	System.out.println(kthSmallest(matrix, 4));
    	System.out.println(kthSmallest(matrix, 11));
    	for (int i = 1; i <= 12; i++) {
    		System.out.println(kthSmallest(matrix, i));
    	}
    }
}
