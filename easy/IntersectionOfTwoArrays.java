import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// O(n) time, O(n) space
public class IntersectionOfTwoArrays {

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
        List<Integer> list = new ArrayList<Integer>(intersection);
        int[] result = new int[intersection.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        
        return result;
    }
}
