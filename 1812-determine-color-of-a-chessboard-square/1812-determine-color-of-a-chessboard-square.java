class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0);
        int num = coordinates.charAt(1);
        
        if((letter + num) % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}