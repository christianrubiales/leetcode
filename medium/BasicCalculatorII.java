
// @see https://leetcode.com/problems/basic-calculator-ii/discuss/63003/Share-my-java-solution/239365
// O(n) time, O(1) space
public class BasicCalculatorII {

	static int calculate(String s) {
		int result = 0;
		int temp = 0;
		int num = 0;
		char op = '+';
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				num = num * 10 + c - '0';
			}
			
			if (i == s.length() - 1 || (!Character.isDigit(c) && c != ' ')) {
				if (op == '+') {
					result += temp;
					temp = num;
				} else if (op == '-') {
					result += temp;
					temp = -num;
				} else if (op == '*') {
					temp *= num;
				} else if (op == '/') {
					temp /= num;
				}
				op = c;
				num = 0;
			}
		}
		
		return result + temp;
	}

	public static void main(String[] args) {
		System.out.println(calculate("0"));//0
		System.out.println(calculate("4/2*3"));//6
		System.out.println(calculate("3+2-2"));//3
		System.out.println(calculate("3+2*2"));//7
		System.out.println(calculate("13+10*2"));//33
		System.out.println(calculate(" 3/2 "));//1
		System.out.println(calculate(" 3+5 / 2 "));//5
	}

}
