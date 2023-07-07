class Solution {
    public String mergeAlternately(String word1, String word2) {
//         replace all spaces in both so there is no white space
        word1.replaceAll(" ", "");
        word2.replaceAll(" ", "");
//         get the lengths of each for iteration
        int word1Len = word1.length();
        int word2Len = word2.length();
//         get the max length so when we iterate it will loop through to the longest string
        int maxLength = Math.max(word1Len, word2Len);
//         initialize our string to concatenate to
        String merged = "";
//         iterate through 
        for (int i = 0; i < maxLength; i++) {
//             check if i is less than the first word length and add the character at i
            if (i < word1Len) {
                merged += word1.charAt(i);
            }
//             check if i is less than the second word length and add the character at i
            if (i < word2Len) {
                merged += word2.charAt(i);
            }
        }
        
        return merged;
        
    }
}