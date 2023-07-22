// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] funnyArr = Arrays.copyOf(nums, (nums.length * 2));
//         int pointer = 0;
//         for (int i = (funnyArr.length / 2); i < funnyArr.length; i++) {
//             funnyArr[i] = nums[pointer];
//             pointer++;
//         }
//         return funnyArr;
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concatenatedArr = new int[n * 2];
        
        // Copy the original array to the beginning of the concatenated array
        System.arraycopy(nums, 0, concatenatedArr, 0, n);
        
        // Copy the original array again to the end of the concatenated array
        System.arraycopy(nums, 0, concatenatedArr, n, n);
        
        return concatenatedArr;
    }
}