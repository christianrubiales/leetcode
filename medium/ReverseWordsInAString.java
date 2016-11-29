

public class ReverseWordsInAString {
	
    public String reverseWords(String s) {
        String[] array = s.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i > -1; i--) {
            sb.append(array[i]).append(" ");
        }
        
        return sb.toString().trim();
    }
}
