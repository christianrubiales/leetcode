import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<Character, Integer> map = new HashMap<>();
    
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    
    public static int romanToInt(String s) {
        int value = map.get(s.charAt(s.length() - 1));
        
        for (int i = s.length() - 1; i > 0; i--) {
            int left = map.get(s.charAt(i-1));
            int right = map.get(s.charAt(i));
            
            if (left < right) {
                value -= left;
            } else {
                value += left;
            }
        }
        
        return value;
    }
    
	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));//58
		System.out.println(romanToInt("MCMXCIV"));//1994

	}

}
