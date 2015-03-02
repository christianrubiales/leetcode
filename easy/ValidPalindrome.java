
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean palindrome = true;
        
        while (j > i) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < s.length() - 1) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && j > i) {
                j--;
            }
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        
        return (s.trim().length() == 0 ? true : (i - j <= 0 ? palindrome : false));
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(".,"));
	}

}
