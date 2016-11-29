import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
	
	// "Crawling Worm" is wrong, use Set
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                // if set is already full, remove the latest addition
                if (set.size() == k) {
                    set.remove(nums[i - k]);
                }
                set.add(nums[i]);
            }
        }
        
        return false;
    }
}
