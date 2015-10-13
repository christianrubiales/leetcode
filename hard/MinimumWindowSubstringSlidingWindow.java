import java.util.HashSet;
import java.util.Set;

public class MinimumWindowSubstringSlidingWindow {

    public String minWindow(String s, String t) {
    	Set<Character> set = new HashSet<Character>();
    	// window length
    	for (int length = t.length(); length < s.length(); length++) {
    		// slides
        	for (int slide = 0; slide < s.length() - length + 1; slide++) {
        		// populate the set for checking
        		set.clear();
        		for (Character c : t.toCharArray()) {
        			set.add(c);
        		}
        		// check the window against the set
        		String substring = s.substring(slide, slide + length);
        		for (Character c : substring.toCharArray()) {
        			set.remove(c);
        		}
        		// all characters of t found
        		if (set.isEmpty()) {
        			return substring;
        		}
        	}
    	}
    
    	return "";
    }
    
	public static void main(String[] args) {
		MinimumWindowSubstringSlidingWindow naive = new MinimumWindowSubstringSlidingWindow();
		System.out.println(naive.minWindow("ADOBECODEBANC", "ABC"));
		System.out.println(naive.minWindow("ADOBECODEBANC", "XYZ"));
	}

}
