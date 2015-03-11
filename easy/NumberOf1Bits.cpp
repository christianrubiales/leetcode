class Solution {
public:
    int hammingWeight(uint32_t n) {
    	int w = 0;
        
        while (n > 0) {
        	if (n % 2 != 0) {
        		w++;
        	}
        	n /= 2;
        }
        
        return w;
    }
};