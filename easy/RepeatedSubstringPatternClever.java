
// O(n^2) time
// O(n) space
public class RepeatedSubstringPatternClever {

    public static boolean repeatedSubstringPattern(String s) {
    	String t = s + s;
    	return t.substring(1, t.length() - 1).contains(s);
	}

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));//true
		System.out.println(repeatedSubstringPattern("aba"));//false
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));//true
		System.out.println(repeatedSubstringPattern("abcabcabc"));//true
	}

}
