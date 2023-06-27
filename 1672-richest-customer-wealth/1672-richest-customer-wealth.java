class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // set the max to zero so that we can store max wealth later on
        
        for(int[] arr : accounts) { // enhanced for loop -> loops through each int[] in accounts and 
                                    // produces a sum that is the stream of each array, calling the 
                                    // built in sum method to add those integers together for each
                                    // int[] arr
            int sum = Arrays.stream(arr).sum();
            maxWealth = Math.max(maxWealth, sum); 
// the Math.max() method ensures that the value of max will constantly be checked against sum and 
// max will store the greater value between the two
        }
        
        return maxWealth; // returns the final max value of the sums
    }
}