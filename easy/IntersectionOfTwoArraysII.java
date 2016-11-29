import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

	// Use two pointers with the sorted arrays, O(nlogn) time due to sorting.
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersection = new ArrayList<Integer>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] result = new int[intersection.size()];
        for (int x = 0; x < intersection.size(); x++) {
            result[x] = intersection.get(x);
        }
        
        return result;
    }
}
