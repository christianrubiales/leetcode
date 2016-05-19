/**
 * Use two pointers.
 * O(n) time, O(1) space.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int d = 0;
        int i = 0;
        int j = 1;
        int max = nums[0];
        
        while (j < nums.length) {
            if (max == nums[j]) {
                d++;
            } else {
                i++;
                max = nums[j];
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            j++;
        }
        
        return nums.length - d;
    }
    
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();
		int[] nums;
		nums = new int[]{}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
		nums = new int[]{1}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
		nums = new int[]{1,1}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
		nums = new int[]{1,1,1}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
		nums = new int[]{1,1,2}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
		nums = new int[]{1,1,2,2}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
		nums = new int[]{1,2,3}; System.out.print(remove.removeDuplicates(nums) + " - "); print(nums);
	}

	private static void print(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.print(nums[i] + ", ");
		}
		if (nums.length > 0) {
			System.out.print(nums[nums.length - 1]);
		}
		System.out.println();
	}
}
