class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plantedFlowers = 0;
        boolean plantedAllFlowers = false;
        for (int i = 0; i < flowerbed.length; i++) {
//          Check if the current plot is empty.
            if (flowerbed[i] == 0) {
//                  check to see if we are at 0 or if the plot to the left is 0
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
//                  checks to see if we are at the end of the flowerbed or if the plot to the right is 0
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
//                  if both plots are empty (0), then we can plant
                if (emptyLeftPlot && emptyRightPlot) {
//                     set the flowerbed at our current index to 1 ie we just planted
                    flowerbed[i] = 1;
//                     increment the number of planted flowers
                    plantedFlowers++;
                }
            }
        }
//         if we planted n or more flowers, then we were able to plant all n flowers with no isses
        if (plantedFlowers >= n) {
            plantedAllFlowers = true;
        }
        
        return plantedAllFlowers;
    }
}