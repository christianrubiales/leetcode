import java.util.Arrays;


/**
 * O(nlogn) because of sorting
 */
public class SingleNumber {
    
	public static int singleNumber(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        
        Arrays.sort(A);
        
        int num = -1;
        for (int i = 0; i < A.length; i+=2) {
        	if (i == A.length - 1 || A[i] != A[i+1]) {
        		num = A[i];
        		break;
        	}
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
	}

}
