import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	static String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public static List<String> letterCombinations(String digits) {
		List<String> mnemonics = new LinkedList<>();
        
        if (digits.length() == 0) {
            return mnemonics;
        }
        
		mnemonics.add("");
		
		for (int i = 0; i < digits.length(); i++) {
			char[] array = map[digits.charAt(i) - '0'].toCharArray();

			int n = mnemonics.size();
			for (int k = 0; k < n; k++) {
				String temp = mnemonics.get(0);
				mnemonics.remove(temp);
				for (int j = 0; j < array.length; j++) {
					mnemonics.add(temp + array[j]);
				}
			}
		}
		
		return mnemonics;
    }
    
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));//ad, ae, af, bd, be, bf, cd, ce, cf
//		System.out.println(letterCombinations("234"));

	}

}
