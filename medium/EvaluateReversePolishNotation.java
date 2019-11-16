import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String token : tokens) {
            if (isOperation(token)) {
                char c = token.charAt(0);
                int op1 = stack.pop();
                int op2 = stack.pop();
                
                if (c == '+') {
                    stack.push(op2 + op1);
                } else if (c == '-') {
                    stack.push(op2 - op1);
                } else if (c == '*') {
                    stack.push(op2 * op1);
                } else if (c == '/') {
                    stack.push(op2 / op1);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    public static boolean isOperation(String token) {
    	if (token.length() != 1) {
    		return false;
    	}
        char c = token.charAt(0);
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

	public static void main(String[] args) {
		System.out.println(evalRPN(new String[] {"2", "1", "+", "3", "*"}));//9
		System.out.println(evalRPN(new String[] {"4", "13", "5", "/", "+"}));//6
		System.out.println(evalRPN(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));//22
		System.out.println(evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));//
	}

}
