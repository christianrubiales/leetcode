
/**
 * Straightforward but O(n) space.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
    	StringBuilder u = new StringBuilder();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (Character.isLetterOrDigit(s.charAt(i))) {
    			u.append(Character.toLowerCase(s.charAt(i)));
    		}
    	}
    	s = u.toString();
    	
    	for (int i = 0; i < s.length() / 2; i ++) {
    		if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(".,"));
	}

}
