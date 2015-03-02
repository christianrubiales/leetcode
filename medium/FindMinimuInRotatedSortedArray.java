
/**
 * O(n) - linear search
 */
public class FindMinimuInRotatedSortedArray {
	
    public int findMin(int[] num) {
    	int min = num[0];
    	
    	for (int i = 1; i < num.length; i++) {
    		if (num[i] < min) {
    			min = num[i];
    			break;
    		}
    	}
    	
    	return min;
    }
    
	public static void main(String[] args) {
		FindMinimuInRotatedSortedArray min = new FindMinimuInRotatedSortedArray();
		System.out.println(min.findMin(new int[]{1}));
		System.out.println(min.findMin(new int[]{1,2}));
		System.out.println(min.findMin(new int[]{2,1}));
		System.out.println(min.findMin(new int[]{2,3,1}));
		System.out.println(min.findMin(new int[]{1,2,3}));
		System.out.println(min.findMin(new int[]{4,5,6,7,0,1,2,3}));
		System.out.println(min.findMin(new int[]{4,5,6,7,0,1,2}));
		System.out.println(min.findMin(new int[]{4,5,6,7,1,2}));
		System.out.println(min.findMin(new int[]{4,5,6,7}));
		System.out.println(min.findMin(new int[]{5,1,2,3,4}));
		System.out.println(min.findMin(new int[]{2,3,4,5,1}));
	}

}
