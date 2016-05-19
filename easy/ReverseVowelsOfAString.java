/**
 * Use two converging pointers.
 */
public class ReverseVowelsOfAString {
    
    public String reverseVowels(String s) {
    	char[] array = s.toCharArray();
    	
    	int i = 0;
    	int j = s.length() - 1;
    	
    	while (i < j) {
    		boolean iIsvowel = isVowel(array[i]);
    		boolean jIsvowel = isVowel(array[j]);
    		if (!iIsvowel) {
    			i++;
    		}
    		if (!jIsvowel) {
    			j--;
    		}
    		if (iIsvowel && jIsvowel) {
    			char t = array[i];
    			array[i] = array[j];
    			array[j] = t;
    			i++;
    			j--;
    		}
    	}
    	
    	return new String(array);
    }
    
    public boolean isVowel(char c) {
    	return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
    			c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
	public static void main(String[] args) {
		ReverseVowelsOfAString reverse = new ReverseVowelsOfAString();
		System.out.println(reverse.reverseVowels("hello"));//holle
		System.out.println(reverse.reverseVowels("leetcode"));//leotcede
		System.out.println(reverse.reverseVowels("aA"));//Aa
	}

}
