import java.util.HashSet;
import java.util.Set;

public class PowerOfThree {
    
    static Set<Integer> set = new HashSet<Integer>();
    
    static {
        int t = 1;
        while (t > 0) {
            set.add(t);
            t *= 3;
        }
    }
    
    public boolean isPowerOfThree(int n) {
        return set.contains(n);
    }
}
