
public class CountAndSay {

    public static String countAndSay(int n) {
        String s = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            char c = s.charAt(0);
            int count = 1;
            
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                } else {
                    builder.append(count).append(c);
                    c = s.charAt(j);
                    count = 1;
                }
            }
            builder.append(count).append(c);
            s = builder.toString();
        }
        
        return s;
    }
    
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(countAndSay(i));
		}
	}

}
