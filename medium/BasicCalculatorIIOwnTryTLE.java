import java.util.LinkedList;
import java.util.List;

/*
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate toward zero.
 */
public class BasicCalculatorIIOwnTryTLE {
	
	static int calculate(String s) {
		s = s.replace(" ", "");
		
		boolean hasOps = false;
		for (int i = 0; i < s.length(); i++) {
			if ("+-*/".indexOf(s.charAt(i)) > -1) {
				hasOps = true;
				break;
			}
		}
		if (!hasOps) {
			return Integer.parseInt(s);
		}
		
		// read numbers
		String[] arr = s.split("[^0-9]+");
		List<Integer> nums = new LinkedList<>();
		for (String t : arr) {
			nums.add(Integer.parseInt(t));
		}
		
		// read operators
		arr = s.replaceAll("[0-9]+", " ").trim().split(" ");
		List<Character> ops = new LinkedList<Character>();
		for (String t : arr) {
			ops.add(t.charAt(0));
		}
		
		// process * and / first
		// ex: 4/2*3=6
		for (int i = 0; i < ops.size(); i++) {
			if (ops.get(i) == '*' || ops.get(i) == '/') {
				int left = nums.get(i);
				int right = nums.get(i+1);
				
				if (ops.get(i) == '*') {
					left *= right;
				} else {
					left /= right;
				}
				nums.set(i, left);
				nums.remove(i+1);
				ops.remove(i);
				i--;
			}
		}

		// process + and -
		int val = nums.get(0);
		for (int i = 0; i < ops.size(); i++) {
			if (ops.get(i) == '+') {
				val += nums.get(i+1);
			} else {
				val -= nums.get(i+1);
			}
		}
		
		return val;
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
