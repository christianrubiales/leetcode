import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public List<Integer> grayCode(int n) {
		List<Integer> codes = new ArrayList<>();
		
		for (int i = 0; i < 1 << n; i++) {
			codes.add(i ^ (i >> 1));
		}
		
		return codes;
	}
}
