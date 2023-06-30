class Solution {
    public int removeDuplicates(int[] nums) {
        int countToRemove = 0;
        int pointer = 1;
        
        for(int i = 0; i < nums.length; i++) {
            if (i == 0) {
                countToRemove++;
            } else if (nums[i] != nums[i - 1]) {
                countToRemove++;
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        
        return countToRemove;
    }
}