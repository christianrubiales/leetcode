import java.util.Arrays;


public class TwoSum {

    public static Integer[] twoSum(int[] numbers, int target) {
    	Integer[] indices = new Integer[2];
        
    	int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
        	temp = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
            	if (numbers[j] == temp) {
            		indices[0] = i + 1;
            		indices[1] = j + 1;
            		
                    return indices;
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
