
public class LongestPalindrome {

    public static void longest_palind(String s) {
        char[] a = s.toCharArray();
        
        for (int i = a.length - 1; i > 1; i--) { // length of window
            for (int j = 0; j < a.length - i; j++) { // number of slides
                if (isPalindrome(a, j, j+i)) {
                    for (int k = j; k <= i; k++) {
                        System.out.print(a[k]);
                    }
                    System.out.println();
                    return;
                }
            }
        }
    }
    
    public static boolean isPalindrome(char[] a, int i, int j) {
        int m = i + (j-i)/2;
        
        for (int x = i; x <= m; x++) {
            if (a[x] != a[j - x]) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
//		longest_palind("aba");//
		longest_palind("abcdxyzyxabcdaaa");//xyzyx
	}

}
