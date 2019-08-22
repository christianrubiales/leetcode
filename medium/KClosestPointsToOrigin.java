import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	
	// O(n log k) time, O(k) space
    static int[][] kClosest(int[][] points, int k) {
    	Comparator<int[]> comparator = new Comparator<int[]>() {
        	@Override
        	public int compare(int[] p1, int[] p2) {
        		Double d1 = Math.sqrt(p1[0]*p1[0] + p1[1]*p1[1]);
        		Double d2 = Math.sqrt(p2[0]*p2[0] + p2[1]*p2[1]);
        		return d2.compareTo(d1);
        	}
        };
    	
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(comparator);
        
        for (int i = 0; i < k; i++) {
        	maxHeap.offer(points[i]);
        }
        
        for (int i = k; i < points.length; i++) {
        	int[] point = points[i];
        	if (comparator.compare(maxHeap.peek(), point) < 0) {
        		maxHeap.poll();
            	maxHeap.offer(points[i]);
        	}
        }
        
        int[][] closest = new int[maxHeap.size()][];
        int i = 0;
        while (!maxHeap.isEmpty()) {
        	closest[i++] = maxHeap.poll();
        }
        
        return closest;
    }
    
    static void print(int[][] points) {
    	for (int i = 0; i < points.length; i++) {
    		System.out.printf("[%d,%d],", points[i][0], points[i][1]);
    	}
    	System.out.println();
    }

	public static void main(String[] args) {
		print(kClosest(new int[][]{{1,3}, {-2,2}}, 1));//[[-2,2]]
		print(kClosest(new int[][]{{3,3}, {5,-1}, {-2,4}}, 2));//[[-2,4],[3,3]]
	}

}
