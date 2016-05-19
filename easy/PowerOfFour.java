// A positive power of 4 in binary starts with 1 followed by even number of zeroes.
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        String s = Integer.toBinaryString(num);
        boolean allTrailingZeroes = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                allTrailingZeroes = false;
                break;
            }
        }
        
        return (s.charAt(0) == '1') && (s.length() % 2 != 0) && allTrailingZeroes;
    }
    
	public static void main(String[] args) {
		PowerOfFour power = new PowerOfFour();
		System.out.println(power.isPowerOfFour(1));
		System.out.println(power.isPowerOfFour(4));
		System.out.println(power.isPowerOfFour(16));
		System.out.println(power.isPowerOfFour(17));
	}

}
