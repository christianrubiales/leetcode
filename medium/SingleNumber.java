/**
 * Find number that appears odd number of times.
 * (Sometimes: find number that appear only once, all others appear twice)
 * 
 * O(n) using XOR.
 */
public class SingleNumber {
    
	public static int singleNumber(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("input must not be null or empty");
		}
		
		int number = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			number ^= numbers[i];
		}
        
        return number;
    }
    
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{-1}));//-1
		System.out.println(singleNumber(new int[]{2,2,1}));//1
		System.out.println(singleNumber(new int[]{1,2,2}));//1
		System.out.println(singleNumber(new int[]{2,1,1}));//2
		System.out.println(singleNumber(new int[]{2,1,2}));//1
		System.out.println(singleNumber(new int[]{1,1,2,3,3}));//2
		System.out.println(singleNumber(new int[]{2,1,2,2,1,2,1}));//1
		System.out.println(singleNumber(new int[]{2,1,3,2,2,1,3,2,1}));//1
	}

}
