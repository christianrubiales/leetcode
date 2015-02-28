import java.util.*;

/**
 * Just use two stacks.
 */
public class MinStack {

    private final Deque<Integer> stack = new ArrayDeque<Integer>();
    private final Deque<Integer> min = new ArrayDeque<Integer>();
    
    public void push(int x) {
        stack.push(x);
        if (min.isEmpty()) {
        	min.push(x);
        } else {
        	min.push(x < getMin() ? x : getMin());
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
    	return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
    
	public static void main(String[] args) {
		// test 1
//		MinStack minStack = new MinStack();
//		minStack.push(-3);
//		System.out.println(minStack.getMin());
		
		// test 2
		MinStack minStack = new MinStack();
		minStack.push(2);
		minStack.push(0);
		minStack.push(3);
		minStack.push(0);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
	}

}
