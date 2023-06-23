class Solution {
    public int[] runningSum(int[] nums) {
//         new int result array that is the same length as nums
        int[] result = new int[nums.length];
//         the first indexes are the same, start at index 0
        result[0] = nums[0];
        
//         start at the first index since we already set the indexes at 0 to be the same
        for(int i = 1; i < nums.length; i++) {
//             set the result at index i equal to the result[i - 1], plus nums[i]
            result[i] = result[i - 1] + nums[i];
        }
        
        return result;
    }
}