import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The trick is to ignore earlier occurrences of duplicate values.
 */
public class TwoSum {

    public static Integer[] twoSum(int[] numbers, int target) {
    	Integer[] indices = new Integer[2];
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	Integer temp;
    	for (int i = 0; i < numbers.length; i++) {
    		temp = map.get(target - numbers[i]);
    		if (temp != null) {
    			indices[0] = temp + 1;
				indices[1] = i + 1;
    		} else {
    			map.put(numbers[i], i);
    		}
    	}
    	
    	return indices;
    }
    
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(twoSum(new int[]{0,4,3,0}, 0)));
		System.out.println(Arrays.deepToString(twoSum(new int[]{3,2,4}, 6)));
	}

}
