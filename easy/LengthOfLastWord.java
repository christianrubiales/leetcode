
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
    	int length = 0;
    	int index = s.length() - 1;
    	
    	if (s.length() > 0 && s.charAt(s.length() - 1) == ' ') {
	    	for (int i = s.length() - 1; i > -1; i--) {
	    		if (s.charAt(i) != ' ') {
	    			index = i;
	    			break;
	    		}
	    	}
    	}

    	for (int i = index; i > -1; i--) {
    		if (s.charAt(i) != ' ') {
    			length++;
    		} else {
    			break;
    		}
    	}
    	
    	return length;
    }
    
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));//5
		System.out.println(lengthOfLastWord("Hello World "));//5
		System.out.println(lengthOfLastWord(""));//0
	}

}
