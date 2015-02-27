import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TwoSum {

    public static Integer[] twoSum(int[] numbers, int target) {
    	Integer[] indices = new Integer[2];
    	
    	// map from array values to indices;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    	
        // populate the map
        List<Integer> list;
        for (int i = 0; i < numbers.length; i++) {
        	list = map.get(numbers[i]);
        	
        	if (list == null) {
        		list = new ArrayList<Integer>();
        		map.put(numbers[i], list);
        	}
        	list.add(i);
        }

        // search
    	int temp;
        for (int i = 0; i < numbers.length; i++) {
        	temp = target - numbers[i];
        	
        	list = map.get(numbers[i]);
        	if (temp == numbers[i] && list.size() > 1) {
        		indices[0] = list.get(0) + 1;
        		indices[1] = list.get(1) + 1;
        		break;
        	} else {
        		indices[0] = list.get(0) + 1;
            	list = map.get(temp);
            	if (list != null) {
            		indices[1] = list.get(0) + 1;
            		if (indices[0] != indices[1]) {
            			break;
            		}
            	}
        	}
        }
        
        return indices;
    }
    
	public static void main(String[] args) {
//		System.out.println(Arrays.deepToString(twoSum(new int[]{0,4,3,0}, 0)));
		System.out.println(Arrays.deepToString(twoSum(new int[]{3,2,4}, 6)));
	}

}
