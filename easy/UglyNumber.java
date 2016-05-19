
/**
 * Just keep dividing by 2, 3 and 5.
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        
        int t = num;
        while (t % 2 == 0) {
            t = t / 2;
        }
        while (t % 3 == 0) {
            t = t / 3;
        }
        while (t % 5 == 0) {
            t = t / 5;
        }
        
        return t == 1;
    }
    
	public static void main(String[] args) {
		UglyNumber ugly = new UglyNumber();
		System.out.println(ugly.isUgly(0));
		System.out.println(ugly.isUgly(-2147483648));
	}

}
