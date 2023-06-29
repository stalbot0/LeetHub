class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] finalArr = new int[2];
        Map<Integer, Integer> mapski = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if(mapski.containsKey(complement)) {
                finalArr[0] = mapski.get(complement);
                finalArr[1] = i;
            }
            
            mapski.put(nums[i], i);
        }
        
        return finalArr;
    }
}