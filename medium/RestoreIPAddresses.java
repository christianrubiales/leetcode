import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
	
    public static List<String> restoreIpAddresses(String s) {
    	List<String> valids = new ArrayList<>();
    	
    	StringBuilder sb = new StringBuilder();
    	for (int a = 1; a < 4; a++) {
    		for (int b = 1; b < 4; b++) {
    			for (int c = 1; c < 4; c++) {
    				for (int d = 1; d < 4; d++) {
    	        		if (a+b+c+d == s.length()) {
    	        			String n1 = s.substring(0, a);
    	        			String n2 = s.substring(a, a+b);
    	        			String n3 = s.substring(a+b, a+b+c);
    	        			String n4 = s.substring(a+b+c);
    	        			
    	        			if (isValid(n1) && isValid(n2) && isValid(n3) && isValid(n4)) {
    	        				sb.append(n1).append('.').append(n2).append('.').append(n3).append('.').append(n4);
    	        				valids.add(sb.toString());
    	        				sb.delete(0, sb.length());
    	        			}
    	        		}
    	        	}	
            	}	
        	}	
    	}
    	
    	return valids;
    }
    
    static boolean isValid(String s) {
    	if ((s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
    		return false;
    	}
    	return true;
    }

	public static void main(String[] args) {
		System.out.println(restoreIpAddresses("25525511135"));// ["255.255.11.135", "255.255.111.35"]
		System.out.println(restoreIpAddresses("010010"));// ["0.10.0.10","0.100.1.0"]
	}

}
