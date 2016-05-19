// A positive power of 4 in binary starts with 1 followed by even number of zeroes.
public class PowerOfFourJavaBuiltInFunctions {

    public boolean isPowerOfFour(int num) {
    	return Integer.bitCount(num) == 1 && Integer.numberOfTrailingZeros(num) % 2 == 0;
    }
    
	public static void main(String[] args) {
		PowerOfFourJavaBuiltInFunctions power = new PowerOfFourJavaBuiltInFunctions();
		System.out.println(power.isPowerOfFour(1));
		System.out.println(power.isPowerOfFour(4));
		System.out.println(power.isPowerOfFour(16));
		System.out.println(power.isPowerOfFour(17));
	}

}
