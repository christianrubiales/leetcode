
public class ZigZagConversion {
	
	// no lists and just one StringBuilder
	// O(n)
    public static String convert(String s, int rows) {
    	if (rows == 1) {
    		return s;
    	}
    	StringBuilder builder = new StringBuilder();
    	
		for (int i = 0; i < rows; i++) {
			if (i == 0 || i == rows - 1) {
    			for (int j = i; j < s.length(); j += 2 * rows - 2) {
    				builder.append(s.charAt(j));
    			}
			} else {
				boolean odd = true;
				for (int j = i; j < s.length(); ) {
    				builder.append(s.charAt(j));
    				if (odd) {
    					j += (rows - i - 1) * 2;
    				} else {
    					j += i * 2;
    				}
    				odd = !odd;
    			}
			}
    	}
    	
    	return builder.toString();
    }

	public static void main(String[] args) {
//		System.out.println(convert("PAYPALISHIRING", 3));// PAHNAPLSIIGYIR
//		System.out.println(convert("PAYPALISHIRING", 4));// PINALSIGYAHRPI
//		System.out.println(convert("AB", 1));//AB
		System.out.println(convert("ABC", 1));// ABC
		System.out.println(convert("ABCD", 2));// ACBD
		System.out.println(convert("ABCDE", 3));// AEBDC
		System.out.println(convert("ABCDEFGH", 3));// AEBDFHCG
	}

}
