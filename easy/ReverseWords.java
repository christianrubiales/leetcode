
public class ReverseWords {

    public static String reverseWords(String s) {
        String[] array = s.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i > -1; i--) {
            sb.append(array[i]).append(" ");
        }
        
        return sb.toString().trim();
    }
    
	public static void main(String[] args) {
		System.out.println(reverseWords(""));
		System.out.println(reverseWords("     "));
		System.out.println(reverseWords("a"));
		System.out.println(reverseWords("  a    b  "));
		System.out.println(reverseWords("a b c"));
		System.out.println(reverseWords("a1 b1 c1"));
	}

}
