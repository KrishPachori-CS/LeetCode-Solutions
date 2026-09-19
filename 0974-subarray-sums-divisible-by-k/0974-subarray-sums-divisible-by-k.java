public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int[] remainderFreq = new int[k];
        remainderFreq[0] = 1;

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
                
                int remainder = sum % k;
                if (remainder < 0) {
                    remainder += k;
                }
                count += remainderFreq[remainder]; 
                
                remainderFreq[remainder]++;
        }
        return count;
    }
}