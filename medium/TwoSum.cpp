class TwoSum {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        vector<int> indices;
        
    	int temp;
        for (int i = 0; i < numbers.size() - 1; i++) {
        	temp = target - numbers[i];
            for (int j = i + 1; j < numbers.size(); j++) {
            	if (numbers[j] == temp) {
            		indices.push_back(i + 1);
            		indices.push_back(j + 1);
            		
                    return indices;
            	}
            }
        }
        
        return indices;
    }
};