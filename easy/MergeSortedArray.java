//Merge starting from both ends of the arrays
//Items remaining in the second array must be put into the front of the first array
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i > -1 && j > -1) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j > -1) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
    
	public static void main(String[] args) {
		MergeSortedArray merge = new MergeSortedArray();
		int[] nums1 = new int[]{4,5,6,0,0,0};
		int[] nums2 = new int[]{1,2,3};
		merge.merge(nums1, 3, nums2, 3);
		for (int x : nums1) {
			System.out.println(x);
		}
	}

}
