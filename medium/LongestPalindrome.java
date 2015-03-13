
/**
 * Sliding window
 */
public class LongestPalindrome {

    public static void longest_palind(String s) {
        for (int i = s.length() - 1; i > 1; i--) { // length of window
            for (int j = 0; j < s.length() - i; j++) { // number of slides
                if (isPalindrome(s, j, j+i)) {
                    for (int k = j; k <= i; k++) {
                        System.out.print(s.charAt(k));
                    }
                    System.out.println();
                    return;
                }
            }
        }
    }
    
    public static boolean isPalindrome(String s, int i, int j) {
        int m = i + (j-i)/2;
        
        for (int x = i; x <= m; x++) {
            if (s.charAt(x) != s.charAt(j - x)) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		longest_palind("abaa");//
		longest_palind("abcdxyzyxabcdaaa");//xyzyx
	}

}
