import java.util.BitSet;

public class MissingNumberUsingBitSet {

    public int missingNumber(int[] nums) {
    	BitSet set = new BitSet(nums.length);
    	for (int i : nums) {
    		set.set(i);
    	}
    	
    	return set.nextClearBit(0);
    }
}
