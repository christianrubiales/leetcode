import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrixUsingHeap {

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                heap.offer(matrix[i][j]);
            }
        }
        for (int i = 0; i < k - 1; i++) {
            heap.poll();
        }
        return heap.poll();
    }
    
    public static void main(String[] args) {
    	int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
    	
    	System.out.println(kthSmallest(matrix, 4));
    	System.out.println(kthSmallest(matrix, 11));
    }
}
