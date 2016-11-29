import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        // counts
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Integer count = counts.get(magazine.charAt(i));
            if (count == null) {
                count = 0;
            }
            count = count + 1;
            counts.put(magazine.charAt(i), count);
        }
        
        // try to construct note
        for (int i = 0; i < ransomNote.length(); i++) {
            Integer count = counts.get(ransomNote.charAt(i));
            if (count == null || count == 0) {
                return false;
            } else {
                count = count - 1;
                counts.put(ransomNote.charAt(i), count);
            }
        }
        
        return true;
    }
}
