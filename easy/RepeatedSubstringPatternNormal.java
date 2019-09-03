
// O(n^2) time
// O(n^2) space, can be O(n) when using StringBuilder
// check if String can be constructed by taking a substring of it and appending multiple copies of the substring together
public class RepeatedSubstringPatternNormal {
	
    public static boolean repeatedSubstringPattern(String s) {
        for (int len = s.length() / 2; len > 0; len--) {
            if (s.length() % len == 0) {
                String t = s.substring(0, len);
                String x = "";
                while (x.length() < s.length()) {
                    x += t;
                }
                if (x.equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));//true
		System.out.println(repeatedSubstringPattern("aba"));//false
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));//true
		System.out.println(repeatedSubstringPattern("abcabcabc"));//true
	}

}
