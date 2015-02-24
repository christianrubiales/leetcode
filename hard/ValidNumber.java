

public class ValidNumber {
	
    public boolean isNumber(String s) {
        boolean valid = false;
        s = s.trim();
        try {
            if (!s.matches(".*\\d+.*")) {
                return false;
            }
            if (s.charAt(s.length() - 1) == '.') {
                s += "0";
            }
            if (!(""+s.charAt(s.length() - 1)).matches("\\d+")) {
                return false;
            }
            Double.parseDouble(s);
            valid = true;
        } catch (Exception e) {}
        return valid;
    }
}
