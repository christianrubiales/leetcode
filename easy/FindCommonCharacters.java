import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	
    public static List<String> commonChars(String[] A) {
        List<String> common = new ArrayList<>();
        int[][] counts = new int[A.length][26];
        
        for (int i = 0; i < A.length; i++) {
            String s = A[i];
            for (int j = 0; j < s.length(); j++) {
                counts[i][s.charAt(j) - 'a']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            int j = 0;
            for (; j < A.length; j++) {
                if (counts[j][i] > 0) {
                    min = Math.min(min, counts[j][i]);
                } else {
                    break;
                }
            }
            if (j == A.length) {
                for (int k = 0; k < min; k++) {
                    common.add("" + ((char)('a'+i)));
                }
            }
        }
        
        return common;
    }

	public static void main(String[] args) {
		System.out.println(commonChars(new String[] {"bella","label","roller"}));//e,l,l
	}
}
