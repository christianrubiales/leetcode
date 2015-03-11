
/**
 * Hamming Weight
 */
public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
//    	return Long.bitCount(n);
//    	return Integer.bitCount(n);
    	
    	int w = 0;
        while (n > 0) {
        	if (n % 2 != 0) {
        		w++;
        	}
        	n /= 2;
        }
        
        return w;
    }
    
	public static void main(String[] args) {
		System.out.println(hammingWeight(1));
		System.out.println(hammingWeight(8));
		System.out.println(hammingWeight(11));
//		System.out.println(hammingWeight(2147483648L));
	}

}
