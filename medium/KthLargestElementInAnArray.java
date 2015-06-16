import java.util.PriorityQueue;


public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for (int i = 0; i < k; i++) {
        	queue.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
        	if (nums[i] >= queue.peek()) {
        		queue.offer(nums[i]);
        		queue.poll();
        	}
        }
        
        return queue.peek();
    }
	
	public static void main(String[] args) {
		System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));//5
		System.out.println(findKthLargest(new int[]{2,1}, 2));//1
	}

}
