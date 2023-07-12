class Solution {
    public boolean increasingTriplet(int[] nums) {
//         initialize two integers to the maximum value
        int pointer1 = Integer.MAX_VALUE, pointer2 = Integer.MAX_VALUE;
        
        for (int n : nums) {
            if (n <= pointer1) {
                pointer1 = n;
            } else if (n <= pointer2) {
                pointer2 = n;
            } else {
                return true;
            }
        }
        return false;
        
    }
}