import java.util.HashSet;
import java.util.Set;

/**
 * Find numbers that appear odd number of times.
 * (Sometimes: find numbers that appear only once, all others appear twice)
 * 
 * O(n) using set.
 */
public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        
        int[] result = new int[set.size()];
        int i = 0;
        for (Integer x : set) {
            result[i++] = x;
        }
        
        return result;
    }
}
