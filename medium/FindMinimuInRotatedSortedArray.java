
/**
 * TODO: practice this.
 */
public class FindMinimuInRotatedSortedArray {
	
    public int findMin(int[] num) {
    	int low = 0;
    	int high = num.length - 1;
    	
		int mid;
    	while (low < high) {
    		if (num[low] < num[high]) {
    			return num[low];
    		}
    		
    		mid = (low + high) / 2;
    		if (num[mid] >= num[low]) {
    			low = mid + 1;
    		} else {
    			high = mid;
    		}
    	}
    	
    	return num[low];
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
