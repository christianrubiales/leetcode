
public class IntegerToRoman {
	
	static String decimalToRoman(int number) {
		String[] M = {"","M","MM","MMM"};
		String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] X = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		StringBuilder builder = new StringBuilder();
		builder.append(M[number/1000])
			.append(C[number/100%10])
			.append(X[number/10%10])
			.append(I[number%10]);
		
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(decimalToRoman(1));//I
		System.out.println(decimalToRoman(58));//LVIII
		System.out.println(decimalToRoman(1994));//MCMXCIV
		System.out.println(decimalToRoman(3999));//MMMCMXCIX
	}

}
