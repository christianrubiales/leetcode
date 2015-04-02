
/**
 * Brute force
 */
public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
    	if (needle.length() == 0) {
    		return 0;
    	}
    	
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) == needle.charAt(j)) {
                	if (j == needle.length() - 1) {
                		return i;
                	}
                } else {
                	break;
                }
            }
        }
        
        return -1;
    }
    
	public static void main(String[] args) {
		System.out.println(strStr("haystack", "stack"));//3
		System.out.println(strStr("haystack", "needle"));//-1
		System.out.println(strStr("haystack", "haystacks"));//-1
		System.out.println(strStr("", ""));//0
		System.out.println(strStr("a", ""));//0
	}

}
