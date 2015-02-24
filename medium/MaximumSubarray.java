

public class MaximumSubarray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{0}));
		System.out.println(maxSubArray(new int[]{-1}));
		System.out.println(maxSubArray(new int[]{-2,1}));
		System.out.println(maxSubArray(new int[]{-3,-2,-2,-3}));
	}

    public static int maxSubArray(int[] A) {
        int mh = A[0];
        int ms = A[0];
        
        for (int i = 1; i < A.length; i++) {
            mh = mh + A[i] > A[i] ? mh + A[i] : A[i];
            ms = mh > ms ? mh : ms;
        }
        
        return ms;
    }
}
