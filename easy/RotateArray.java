import java.util.Arrays;


/**
 * Make sure to be able to reverse a range with 0, 1, 2 elements, at the start and at the end. 
 */
public class RotateArray {
	
	public static Integer[] rotate(Integer[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k > 1 ? k - 1 : 0);
		reverse(nums, k, nums.length - 1);
		
		return nums;
	}
	
	public static Integer[] reverse(Integer[] a, int i, int j) {
		int m = (j - i)/2;
		
		int t;
		for (int k = 0; k <= m; k++) {
			t = a[i+k];
			a[i+k] = a[j-k];
			a[j-k] = t;
		}

		return a;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(rotate(new Integer[]{1}, 0)));
		System.out.println(Arrays.deepToString(rotate(new Integer[]{1,2,3,4,5,6,7}, 3)));
		Integer[] a = new Integer[]{0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < 20; i++) {
			System.out.println(Arrays.deepToString(rotate(a, 1)));
		}
	}

}
