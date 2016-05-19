import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        Integer t = n;
        
        while (t != 1) {
            String s = Integer.toString(t);
            t = 0;
            for (int i = 0; i < s.length(); i++) {
                t += (int) Math.pow(Integer.parseInt(s.substring(i, i + 1)), 2);
            }
            if (set.contains(t)) {
            	break;
            }
            set.add(t);
        }
        
        return t == 1;
    }

	public static void main(String[] args) {
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.isHappy(9));//false
		System.out.println(happyNumber.isHappy(19));//true
	}

}
