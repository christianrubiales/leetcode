
public class CountAndSay2015 {

    public static String countAndSay(int n) {
    	
    	if (n == 1) {
    		return "1";
    	}
    	String t = "1";
    	for (int i = 1; i < n; i++) {
    		t = countAndSay(t);
    	}
    	
    	return t;
    }
    
    public static String countAndSay(String n) {
        StringBuilder sb = new StringBuilder();
        char[] array = n.toCharArray();
        
        char prev = '0';
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
        	if (array[i] == prev) {
        		count++;
        	} else {
        		if (prev != '0') {
	        		sb.append(count);
	        		sb.append(prev);
        		}
        		prev = array[i];
        		count = 1;
        	}
        }
		sb.append(count);
		sb.append(prev);
        
        return sb.toString();
    }
    
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(countAndSay(i));
		}
	}

}
