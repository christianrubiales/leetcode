

public class LongestCommonPrefix {

	public static void main(String[] args) {
//		System.out.println(longestCommonPrefix(new String[]{}));
		System.out.println(longestCommonPrefix(new String[]{"12345", "12354", "123745464"}));
	}

    public static String longestCommonPrefix(String[] strs) {
        int c = 0;
        int min = strs.length > 0 ? Integer.MAX_VALUE : 0;
        
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        
        for (int i = 0; i < min; i++) {
            boolean b = true;
            if (strs.length > 0) {
                char ch = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (ch != strs[j].charAt(i)) {
                    	b = false;
                        break;
                    }
                }
                if (b) {
                    c++;
                } else {
                	break;
                }
            }
        }
        
        return strs.length > 0 ? strs[0].substring(0, c) : "";
    }
}
