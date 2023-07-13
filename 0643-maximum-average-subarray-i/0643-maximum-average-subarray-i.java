class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0.0;
        int currWindow = 0;
//         this will give us the sum of the first k values in nums
        for (int i = 0; i < k; i++) {
            currWindow += nums[i];
        }
//         set the max to the current window to compare
        int maxSum = currWindow;
        
//         start iterating at k, to nums.length
        for (int i = k; i < nums.length; i++) {
//             add the value at i
            currWindow += nums[i];
//             remove the value before
            currWindow -= nums[i - k];
//             compare the current against max sum and store
            maxSum = Math.max(maxSum, currWindow);
        }
//         put the variables into doubles
        double max = maxSum;
        double k2 = k;
        
        return max / k2;
    }
}