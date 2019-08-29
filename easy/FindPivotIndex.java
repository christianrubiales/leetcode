
public class FindPivotIndex {
	
    public static int pivotIndex(int[] numbers) {
		if (numbers == null) {
			throw new IllegalArgumentException("input must not be null");
		}
	
    	int prefixSum = 0;
    	int suffixSum = 0;
    	
    	for (int number : numbers) {
    		suffixSum += number;
    	}
    	
    	for (int i = 0; i < numbers.length; i++) {
    		suffixSum -= numbers[i];
    		
    		if (prefixSum == suffixSum) {
    			return i;
    		}
    		
    		prefixSum += numbers[i];
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
		
		System.out.println(pivotIndex(null));

	}

}
