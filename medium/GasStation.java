
// @see https://leetcode.com/problems/gas-station/discuss/42666/Simple-O(n)-Java-solution-with-comments/177210
public class GasStation {
	
	// O(n) time in one pass, instead of naive O(n^2) 
	static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int index = 0;
        
        for (int i = 0; i < gas.length; i++) {
        	int current = gas[i] - cost[i];
        	tank += current;
        	if (tank < 0) {
        		tank = 0;
        		index = i + 1;
        	}
        	total += current;
        }
        
        return total >= 0 ? index : -1;
    }

	public static void main(String[] args) {
		System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));//3
		System.out.println(canCompleteCircuit(new int[] {2,3,4}, new int[] {3,4,3}));//-1
	}

}
