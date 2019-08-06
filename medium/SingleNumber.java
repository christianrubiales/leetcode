/**
 * Find number that appears odd number of times.
 * (Sometimes: find number that appear only once, all others appear twice)
 * 
 * O(n) using XOR.
 */
public class SingleNumber {
    
	public static int singleNumber(int[] A) {
		int num = A[0];
		
		for (int i = 1; i < A.length; i++) {
			num ^= A[i];
		}
        
        return num;
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
