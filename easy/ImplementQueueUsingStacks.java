import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacks {

    
    Deque<Integer> s1 = new ArrayDeque<>();
    Deque<Integer> s2 = new ArrayDeque<>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
