import java.util.HashSet;
import java.util.Set;


public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean contains = false;
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
        	if (set.contains(i)) {
        		contains = true;
        		break;
        	} else {
        		set.add(i);
        	}
        }
        
    	return contains;
    }
	
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[]{2,4,5,2,7}));//true
		System.out.println(containsDuplicate(new int[]{2,4,5,7}));//false
	}

}
