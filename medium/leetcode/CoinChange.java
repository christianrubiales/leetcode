package leetcode;

// @see https://leetcode.com/problems/coin-change/discuss/77404/JAVA-Easy-Version-To-Understand!!!!!
// @see https://www.youtube.com/watch?v=jgiZlGzXMBw
// O(coins.length * amount) ~ O(n^2) time, O(amount) ~O(n) space 
public class CoinChange {
	
	static int coinChange(int[] coins, int amount) {
		if (coins == null || coins.length == 0 || amount < 0) {
			return -1;
		}
		
		int[] dp = new int[amount + 1];
		
		for (int i = 1; i <= amount; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int coin : coins) {
				if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
				}
			}
		}
		
		return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
	}

	public static void main(String[] args) {
		System.out.println(coinChange(new int[] {1,2,5}, 11));//3
		System.out.println(coinChange(new int[] {2,3,4}, 1));//-1
		System.out.println(coinChange(new int[] {2,4}, 11));//-1
		System.out.println(coinChange(new int[] {1}, 0));//0

	}

}
