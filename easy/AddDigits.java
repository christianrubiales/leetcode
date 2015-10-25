
public class AddDigits {

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            String s = Integer.toString(num);
            num = 0;
            for (int i = 0; i < s.length(); i++) {
                num += Integer.parseInt("" + s.charAt(i));
            }
            return addDigits(num);
        }
    }
	
	public static void main(String[] args) {
		System.out.println(addDigits(0));
		System.out.println(addDigits(38));
	}

}
