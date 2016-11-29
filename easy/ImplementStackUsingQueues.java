import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues {

    Queue<Integer> q = new ArrayDeque<>();
    
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        for (int i = 0; i < q.size() - 1; i++)  {
            q.add(q.remove());
        }
        q.remove();
    }

    // Get the top element.
    public int top() {
        for (int i = 0; i < q.size() - 1; i++)  {
            q.add(q.remove());
        }
        int top = q.peek();
        q.add(q.remove());
        
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
