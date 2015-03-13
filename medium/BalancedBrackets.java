import java.util.LinkedList;


public class BalancedBrackets {

    public static void balanced_brackets(String s) {
    	LinkedList<Character> stack = new LinkedList<Character>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (stack.isEmpty()) {
    			stack.push(s.charAt(i));
    		} else {
    			if (stack.peek().equals('(') && s.charAt(i) == ')') {
    				stack.pop();
    			} else {
    				stack.push(s.charAt(i));
    			}
    		}
    	}
    	System.out.println(stack.isEmpty() ? "Balanced" : "Unbalanced");
    }
    
	public static void main(String[] args) {
		balanced_brackets("(())())");//Unbalanced
		balanced_brackets("(())(())");//Balanced
		balanced_brackets("(()())");//Balanced
		balanced_brackets("())(()");//Unbalanced
	}

}
