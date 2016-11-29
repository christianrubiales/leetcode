
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int containsZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > containsZero) {
                    nums[containsZero] = nums[i];
                    nums[i] = 0;
                }
                containsZero++;
            }
        }
    }
}
