import java.util.ArrayList;
import java.util.List;

public class ZigZagConversionTry {
	
    public static String convert(String s, int numRows) {
    	List<List<Character>> rows = new ArrayList<>();
        
    	for (int i = 0; i < numRows; i++) {
    		rows.add(new ArrayList<>());
    	}
    	
    	boolean downwards = true;
    	int step = 0;
    	for (int i = 0; i < s.length(); i++) {
    		rows.get(step).add(s.charAt(i));
    		if (downwards) {
    			if (step != numRows-1) {
        			step++;
    			} else {
    				downwards = false;
    				if (step != 0) {
    					step--;
    				}
    			}
    		} else {
    			if (step != 0) {
    				step--;
    			} else {
    				downwards = true;
    				if (step < numRows-1) {
    					step++;
    				}
    			}
    		}
    	}

    	StringBuilder builder = new StringBuilder();
    	for (int i = 0; i < numRows; i++) {
    		for (char c : rows.get(i)) {
    			builder.append(c);
    		}
    	}
    	
    	return builder.toString();
    }
    
	public static void main(String[] args) {
//		System.out.println(convert("PAYPALISHIRING", 3));// PAHNAPLSIIGYIR
//		System.out.println(convert("PAYPALISHIRING", 4));// PINALSIGYAHRPI
//		System.out.println(convert("AB", 1));//
		System.out.println(convert("ABC", 1));// 

	}

}
