
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int missing = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            missing ^= nums[i];
            missing ^= i;
        }
        
        return missing;
    }
}
