class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandyCountBeforeExtras = candies[0];
        
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > highestCandyCountBeforeExtras) {
                highestCandyCountBeforeExtras = candies[i];
            }
        }
        
        List<Boolean> greatestOrNot = new ArrayList<>();
        
        for (int candy : candies) {
            if (candy + extraCandies >= highestCandyCountBeforeExtras) {
                greatestOrNot.add(true);
            } else {
                greatestOrNot.add(false);
            }
        }
        
        return greatestOrNot;
    }
}