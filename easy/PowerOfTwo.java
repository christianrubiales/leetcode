
/**
 * A positive number is a power of two if the binary representation only has one set bit.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return (n > 0 && Integer.bitCount(n) == 1);
    }
}
