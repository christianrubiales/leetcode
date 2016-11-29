import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	// Use a map
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                }
            }
            if (map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}
