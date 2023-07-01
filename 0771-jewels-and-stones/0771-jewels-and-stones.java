class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> mappy = new HashMap<>();
        
        for(int i = 0; i < jewels.length(); i++) {
            mappy.put(jewels.charAt(i), 0);
        }
        
        for(int i = 0; i < stones.length(); i++) {
            if(mappy.containsKey(stones.charAt(i))) {
                mappy.replace(stones.charAt(i), (mappy.get(stones.charAt(i)) + 1));
            }
        }
        
        int sum = 0;
        
        for(Integer n : mappy.values()) {
            sum += n;
        }
        
        return sum;
    }
}