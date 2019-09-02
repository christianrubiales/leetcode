
public class StringCompression {

    public static int compress(char[] chars) {
    	if (chars.length == 1) {
    		return 1;
    	}
    	
    	char current =  chars[0];
    	int count = 1;
    	int index = 0;
    	
    	for (int i = 1; i < chars.length; i++) {
    		if (chars[i] == current) {
    			count++;
    		} else {
    			index = writeCount(chars, current, count, index);
				index++;
    			current = chars[i];
    			count = 1;
    		}
    	}
    	index = writeCount(chars, current, count, index);
    	
        return index + 1;
    }

	private static int writeCount(char[] chars, char current, int count, int index) {
		chars[index] = current;
		if (count != 1) {
			char[] s = Integer.toString(count).toCharArray();
			for (int j = 0; j < s.length; j++) {
				chars[++index] = s[j];
			}
		}

		return index;
	}
    
	public static void main(String[] args) {
		char[] chars = "a".toCharArray();
		System.out.println(compress(chars));
		System.out.println(chars);
		
		chars = "aabbccc".toCharArray();
		System.out.println(compress(chars));
		System.out.println(chars);
		
		chars = "aa".toCharArray();
		System.out.println(compress(chars));
		System.out.println(chars);
		
		chars = "abbbbbbbbbbbb".toCharArray();
		System.out.println(compress(chars));
		System.out.println(chars);
		
		chars = "aaaaab".toCharArray();
		System.out.println(compress(chars));
		System.out.println(chars);
	}

}
