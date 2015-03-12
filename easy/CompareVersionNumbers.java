
public class CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\.");
    	String[] v2 = version2.split("\\.");
    	Integer i1 = 0;
    	Integer i2 = 0;
    	int max = Math.max(v1.length, v2.length); 
    	
    	for (int i = 0; i < v1.length; i++) {
    		i1 += ((int) Math.pow(10, max - i)) * (Integer.parseInt(v1[i]));
    	}

    	for (int i = 0; i < v2.length; i++) {
    		i2 += ((int) Math.pow(10, max - i)) * (Integer.parseInt(v2[i]));
    	}
    	
    	return i1.compareTo(i2);
    }
    
	public static void main(String[] args) {
		System.out.println(compareVersion("0.1", "0.0.1")); // 1
		System.out.println(compareVersion("0", "1")); // -1
		System.out.println(compareVersion("1.1", "1")); // -1
	}

}
