import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowelsOfAStringUsingSet {

    static Set<Character> vowels = new HashSet<Character>();
    static {
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
        vowels.add('A');vowels.add('E');vowels.add('I');vowels.add('O');vowels.add('U');
    }
    
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        List<Node> list = new ArrayList<Node>();
        
        // scan for vowels
        for (int i = 0; i < array.length; i++) {
            if (vowels.contains(array[i])) {
                Node node = new Node();
                node.index = i;
                node.letter = array[i];
                list.add(node);
            }
        }
        
        // reverse vowels
        for (int i = 0; i < list.size() / 2; i++) {
        	char t = list.get(i).letter;
        	list.get(i).letter = list.get(list.size() - i - 1).letter;
        	list.get(list.size() - i - 1).letter = t;
        }
        
        // save reversed vowels
        for (Node node : list) {
        	array[node.index] = node.letter;
        }
        
        return new String(array);
    }
    
    public static class Node {
        int index;
        char letter;
    }
    
	public static void main(String[] args) {
		ReverseVowelsOfAStringUsingSet reverse = new ReverseVowelsOfAStringUsingSet();
		System.out.println(reverse.reverseVowels("hello"));//holle
		System.out.println(reverse.reverseVowels("leetcode"));//leotcede
		System.out.println(reverse.reverseVowels("aA"));//Aa
	}

}
