
/**
 * FIXME
 */
public class CountAndSay {

    public static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        char[] array = Integer.toString(n).toCharArray();
        if (array.length == 1 && array[0] == '1') {
        	return "1";
        }
        
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
		System.out.println(countAndSay(1));//1
		System.out.println(countAndSay(11));//21
		System.out.println(countAndSay(21));//1211
		System.out.println(countAndSay(1211));//111221
	}

}
