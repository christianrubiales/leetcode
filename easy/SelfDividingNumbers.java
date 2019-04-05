import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            int n = i;
            while (n != 0) {
                if (((i % 10) == 0) || (i % (n % 10) != 0)) {
                    break;
                }
                n /= 10;
            }
            if (n == 0) {
            		numbers.add(i);
            }
        }
        
        return numbers;
    }
    
    public static void main(String[] args) {
    		System.out.println(selfDividingNumbers(1, 22));
    }
}
