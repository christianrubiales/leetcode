
public class ReverseInteger {

    public static int reverse(int x) {
        boolean negative = x < 0;
        
        if (negative) {
        	x *= -1;
        }
        long l = Long.parseLong(new StringBuilder().append(x).reverse().toString().replace("-", ""));
        x =  l > Integer.MAX_VALUE ? 0 : (int) l;
        
        return negative ? x * -1 : x;
    }
    
	public static void main(String[] args) {
		System.out.println(reverse(123));//321
		System.out.println(reverse(-123));//-321
		System.out.println(reverse(1534236469));//0
		System.out.println(reverse(-2147483648));//0
		System.out.println(reverse(1534236469));//0
	}

}
