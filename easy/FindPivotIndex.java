
public class FindPivotIndex {
	
    public static int pivotIndex(int[] nums) {
    	
    	int prefix = 0;
    	int suffix = 0;
    	
    	for (int i : nums) {
    		suffix += i;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		suffix -= nums[i];
    		
    		if (prefix == suffix) {
    			return i;
    		}
    		
    		prefix += nums[i];
    	}
    	
    	return -1;
    }

	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,2,1};
		System.out.println(pivotIndex(A));//2

		A = new int[] {1,2,3,2};
		System.out.println(pivotIndex(A));//-1

		A = new int[] {-1,-1,-1,0,1,1};
		System.out.println(pivotIndex(A));//0

		A = new int[] {-1,-1,0,1,1,0};
		System.out.println(pivotIndex(A));//5

		A = new int[] {};
		System.out.println(pivotIndex(A));//-1

	}

}
