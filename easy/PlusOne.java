import java.util.Arrays;


/**
 * Using Math.pow is complicated and will lead to out of range errors.
 */
public class PlusOne {
	
    public static Integer[] plusOne(Integer[] digits) {
    	long c = 1;
        
    	// increment
        for (int i = 0; i < digits.length; i++) {
        	c += digits[i] * Math.pow(10, digits.length - i - 1);
        }
        
        // get number of digits of new number
        int places = 0;
        long copy = c;
        while (copy > 0) {
        	places++;
        	copy /= 10;
        }
        
        Integer[] result = new Integer[places];
        for (int i = places - 1; i > -1; i--) {
        	result[i] = (int) (c % ((long) Math.pow(10, places - i)) / ((long) Math.pow(10, places - i - 1)));
        	c -= result[i];
        }
        
        return result;
    }

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{1})));//2
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{8})));//9
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{1,2,3})));//124
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{9,9,9})));//1000
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{9,9,9,9})));//10000
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{9,8,7,6,5,4,3,2,1,0})));//9876543211
		System.out.println(Arrays.deepToString(plusOne(new Integer[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3})));//6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3
	}

}
