
public class MajorityElement {

    public static int majorityElement(int[] num) {
        int c = 0;
        Integer M = null;
    	
    	for (int i = 0; i < num.length; i++) {
    		if (M == null) {
    			M = num[i];
    			c++;
    		} else {
    			if (M.equals(num[i])) {
    				c++;
    			} else {
    				c--;
    				if (c == 0) {
    					M = null;
    				}
    			}
    		}
    	}
    	
    	return M;
    }
    
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[]{1})); // 1
		System.out.println(majorityElement(new int[]{1, 1, 2})); // 1
		System.out.println(majorityElement(new int[]{1, 1, 1, 2, 3})); // 1
		System.out.println(majorityElement(new int[]{3, 3, 3, 2, 1})); // 3
	}

}
