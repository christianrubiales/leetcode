import java.util.ArrayList;
import java.util.List;


/**
 * FIXME
 */
public class ZigZagConversion {

    public String convert(String s, int nRows) {
    	String converted = "";
    	int midRow = (nRows-1)/2;
    	
    	// initialize rows
    	List<StringBuilder> rows = new ArrayList<StringBuilder>();
    	for (int i = 0; i < nRows; i++) {
    		rows.add(new StringBuilder());
    	}
    	
    	int r = 0;
    	boolean secondColumn = false;
    	for (int i = 0; i < s.length(); i++) {
    		if (r == nRows) {
    			secondColumn = true;
    		}
    		if (secondColumn) {
    			rows.get(midRow).append(s.charAt(i));
    			r = 0;
    			secondColumn = false;
    		} else {
    			rows.get(r).append(s.charAt(i));
    			r++;
    		}
    	}
    	
    	// summarize
    	for (int i = 0; i < nRows; i++) {
    		converted += rows.get(i).toString();
    	}
    	
    	return converted;
    }
    
	public static void main(String[] args) {
		ZigZagConversion conversion = new ZigZagConversion();
		System.out.println(conversion.convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR
		System.out.println(conversion.convert("ABCD", 2)); // ACBD
	}

}
