import java.util.ArrayDeque;
import java.util.Deque;

public class BasicCalculator {

    static int calculate(String s) {
    	Deque<Integer> stack = new ArrayDeque<>();
    	
    	int result = 0;
    	int num = 0;
    	int sign = 1;
    	
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (Character.isDigit(c)) {
    			num = num * 10 + c - '0';
    		} else if (c == '+') {
    			result += (sign * num);
    			sign = 1;
    			num = 0;
    		} else if (c == '-') {
    			result += (sign * num);
    			sign = -1;
    			num = 0;
    		} else if (c == '(') {
    			stack.push(result);
    			stack.push(sign);
    			
    			sign = 1;
    			result = 0;
    		} else if (c == ')') {
    			result += (sign * num);
    			result *= stack.pop();
    			result += stack.pop();
    			num = 0;
    		}
    	}
    	
		return result + (sign * num);
    }

	public static void main(String[] args) {
		System.out.println(calculate("0"));//0
		System.out.println(calculate("1 + 1"));//2
		System.out.println(calculate(" 2-1 + 2 "));//3
		System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));//23
	}

}
