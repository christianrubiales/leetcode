import java.util.Arrays;


/**
 * Just use straightforward addition with carry, special cases for trailing 9s.
 * Using Math.pow is complicated and will lead to out of range errors.
 */
public class PlusOne {
	
    public static Integer[] plusOne(Integer[] digits) {
    	Integer[] result = null;
    	
    	if (digits[digits.length - 1] != 9) {
    		result = new Integer[digits.length];
    		for (int i = 0; i < digits.length - 1; i++) {
    			result[i] = digits[i];
    		}
    		result[digits.length - 1] = digits[digits.length - 1] + 1;
    	} else {
    		// check if all 9s
    		boolean all9s = true;
    		for (int i = 0; i < digits.length; i++) {
    			if (digits[i] != 9) {
    				all9s = false;
    				break;
    			}
    		}
    		
    		if (all9s) {
        		result = new Integer[digits.length + 1];
        		result[0] = 1;
        		for (int i = 1; i < result.length; i++) {
            		result[i] = 0;
        		}
    		} else {
        		result = new Integer[digits.length];
        		int i = result.length - 1;
        		for (; i > -1; i--) {
        			if (digits[i] == 9) {
        				result[i] = 0;
        			} else {
        				result[i] = digits[i] + 1;
        				i--;
        				break;
        			}
        		}
        		for (; i > -1; i--) {
        			result[i] = digits[i];
        		}
    		}
    	}
    	
    	return result;
    }

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{1})));//2
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{8})));//9
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{1,2,3})));//124
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{8,9})));//90
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{8,8,9})));//890
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{9,9,9})));//1000
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{9,9,9,9})));//10000
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{9,8,7,6,5,4,3,2,1,0})));//9876543211
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3})));//6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4
	}

}
