
// O(n^2) time
// O(n) space 
public class RepeatedSubstringPatternNormalStringBuilder {

    public static boolean repeatedSubstringPattern(String s) {
    	StringBuilder builder = new StringBuilder();
        for (int len = s.length() / 2; len > 0; len--) {
            if (s.length() % len == 0) {
                builder.delete(0, builder.length());
                while (builder.length() < s.length()) {
                	for (int i = 0; i < len; i++) {
                		builder.append(s.charAt(i));
                	}
                }
                boolean matches = true;
                for (int j = 0; j < builder.length(); j++) {
                	if (builder.charAt(j) != s.charAt(j)) {
                		matches = false;
                		break;
                	}
                }
                if (matches) {
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
		System.out.println(repeatedSubstringPattern("aaaaa"));//true
	}
}
