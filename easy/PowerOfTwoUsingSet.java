import java.util.HashSet;
import java.util.Set;

public class PowerOfTwoUsingSet {

	// Generate set containing all powers of two
    static Set<Integer> power = new HashSet<>();
    static {
        for (int i = 0; i < 31; i++) {
            power.add(1 << i);
        }
    }
    
    public boolean isPowerOfTwo(int n) {
        return power.contains(n);
    }
}
