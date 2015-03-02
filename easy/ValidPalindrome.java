
/**
 * TRicky to implement O(1) space. The O(n) space implementation is straightforward.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (j > i) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < s.length() - 1) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && j > 0) {
                j--;
            }
            if (j >= i) {
            	if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
	                i++;
	                j--;
            	} else {
                    return false;
                }
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(".,"));
		System.out.println(isPalindrome("a."));
		System.out.println(isPalindrome("aa"));
		System.out.println(isPalindrome("\"Sue,\" Tom smiles, \"Selim smote us.\""));
	}

}
