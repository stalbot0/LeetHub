class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0.0;
        
        int currWindow = 0;
        
//         this will give us the sum of the first k values in nums
        for (int i = 0; i < k; i++) {
            currWindow += nums[i];
        }
        
        int maxSum = currWindow;
        
        for (int i = k; i < nums.length; i++) {
            currWindow += nums[i];
            currWindow -= nums[i - k];
            maxSum = Math.max(maxSum, currWindow);
        }
        
        double max = maxSum;
        double k2 = k;
        
        return max / k2;
    }
}