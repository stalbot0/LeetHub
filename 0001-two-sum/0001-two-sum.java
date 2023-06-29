class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] finalArr = new int[2];
        Map<Integer, Integer> mapski = new HashMap<>(); // create new hashmap to store the values
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // the complement integer is that target minus index of nums as we iterate through
            
            //if the map contains the complement, the final array stores the values
            if(mapski.containsKey(complement)) {
                finalArr[0] = mapski.get(complement);
                finalArr[1] = i;
            }
            
            mapski.put(nums[i], i);
        }
        
        return finalArr;
    }
}