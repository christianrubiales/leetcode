

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strings) {
        int length = 0;
        int min = strings.length > 0 ? Integer.MAX_VALUE : 0;
        
        // get the length of the shortest string
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < min) {
                min = strings[i].length();
            }
        }
        
        // just keep comparing until a mismatch is found
        for (int i = 0; i < min; i++) {
            boolean matches = true;
            if (strings.length > 0) {
                char ch = strings[0].charAt(i);
                for (int j = 1; j < strings.length; j++) {
                    if (ch != strings[j].charAt(i)) {
                    	matches = false;
                        break;
                    }
                }
                if (matches) {
                    length++;
                } else {
                	break;
                }
            }
        }
        
        return strings.length > 0 ? strings[0].substring(0, length) : "";
    }

	public static void main(String[] args) {
//		System.out.println(longestCommonPrefix(new String[]{}));
		System.out.println(longestCommonPrefix(new String[]{"12345", "12354", "123745464"}));
	}
}
