class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        
        int num = romanNumerals.get(s.charAt(s.length() - 1));
        // Loop for each character from right to left
        for (int i = s.length() - 2; i >= 0; i--) {
            // Check if the character at right of current character is
            // bigger or smaller
            if (romanNumerals.get(s.charAt(i)) >= romanNumerals.get(s.charAt(i + 1))) {
                num += romanNumerals.get(s.charAt(i));
            } else {
                num -= romanNumerals.get(s.charAt(i));
            }
        }
        return num;
        
    }
}