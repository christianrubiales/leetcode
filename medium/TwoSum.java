import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static Integer[] twoSum(int[] numbers, int target) {
    	Integer[] indices = new Integer[2];
    	
    	// put all values-indices pairs into the map, overwriting earlier indices
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < numbers.length; i++) {
    		map.put(numbers[i], i);
    	}
    	
    	// search
    	Integer temp;
    	for (int i = 0; i < numbers.length; i++) {
    		temp = map.get(target - numbers[i]) ;
    		if (temp != null && temp != i) {
    			indices[0] = i + 1;
    			indices[1] = temp + 1;
    			
    			return indices;
    		}
    	}
    	
    	return indices;
    }
    
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(twoSum(new int[]{0,4,3,0}, 0)));
		System.out.println(Arrays.deepToString(twoSum(new int[]{3,2,4}, 6)));
	}

}
