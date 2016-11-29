
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n+1];
        
        for (int i = 2; i < n+1; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i*i < n; i++) {
            if (!sieve[i]) {
                continue;
            }
            for (int j = i+i; j < n; j += i) {
                sieve[j] = false;
            }
        }
        
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (sieve[i]) {
                count++;
            }
        }
        
        return count;
    }
}
