
public class ExcelSheetColumnNumber {

	public static int titleToNumber(String s) {
		int n = 0;
		int b = (int) 'A' - 1;
		
		for (int i = 0; i < s.length(); i++) {
			n += ((s.charAt(i) - b) * Math.pow(26, (s.length() - i - 1)));
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));//1
		System.out.println(titleToNumber("B"));//2
		System.out.println(titleToNumber("C"));//3
		System.out.println(titleToNumber("Z"));//26
		System.out.println(titleToNumber("AA"));//27
		System.out.println(titleToNumber("AB"));//28
		System.out.println(titleToNumber("BA"));//53
		System.out.println(titleToNumber("AAA"));//703
		System.out.println(titleToNumber("AAAA"));//18279
	}

}
