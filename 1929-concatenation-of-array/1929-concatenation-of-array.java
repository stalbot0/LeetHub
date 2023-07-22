class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] funnyArr = Arrays.copyOf(nums, (nums.length * 2));
        int pointer = 0;
        for (int i = (funnyArr.length / 2); i < funnyArr.length; i++) {
            funnyArr[i] = nums[pointer];
            pointer++;
        }
        return funnyArr;
    }
}