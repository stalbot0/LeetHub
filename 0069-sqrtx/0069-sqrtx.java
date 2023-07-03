class Solution {
    public int mySqrt(int x) {
        double y = 0;
        y = Math.sqrt(x);
        y = Math.floor(y);
        int z = (int) y;
        
        return z;
    }
}