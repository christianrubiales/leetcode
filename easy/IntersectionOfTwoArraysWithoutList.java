import java.util.HashSet;
import java.util.Set;

// O(n) time, O(n) space
public class IntersectionOfTwoArraysWithoutList {

    public int[] intersection(int[] nums1, int[] nums2) {
        
        // put first items in set
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums1) {
            set.add(i);
        }
        
        // check second items if in set
        Set<Integer> intersection = new HashSet<Integer>();
        for (int j : nums2) {
            if (set.contains(j)) {
                intersection.add(j);
            }
        }
        
        // copy results to an array
        int i = 0;
        int[] result = new int[intersection.size()];
        for (int k : intersection) {
            result[i++] = k;
        }
        
        return result;
    }
}
