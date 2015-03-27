import java.util.HashMap;
import java.util.Map;


/**
 * Two passes but O(n) using HashMap.
 * Actually gets Time Limit Exceeded, unlike the O(nlogn) using sorting, 
 * probably because of the HashMap and Autoboxing and Unboxing.
 */
public class SingleNumber {
    
	public static int singleNumber(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        
        int num = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : A) {
        	Integer i = map.get(a);
        	if (i == null) {
        		i = 0;
        	}
        	i++;
        	map.put(a, i);
        }
        
        for (int a : A) {
        	if (map.get(a) == 1) {
        		num = a;
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
