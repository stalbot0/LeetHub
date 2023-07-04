class Solution {
    public boolean squareIsWhite(String coordinates) {
//         get the ASCII values for the letters and numbers
        int letter = coordinates.charAt(0);
        int num = coordinates.charAt(1);
        
        return ((letter + num) % 2 != 0);
    }
}