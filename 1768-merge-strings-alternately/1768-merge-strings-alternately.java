class Solution {
    public String mergeAlternately(String word1, String word2) {
//         trim both so there are no spaces
        word1.replaceAll(" ", "");
        word2.replaceAll(" ", "");
        int word1Len = word1.length();
        int word2Len = word2.length();
        int maxLength = Math.max(word1Len, word2Len);
        
        String merged = "";
        
        for (int i = 0; i < maxLength; i++) {
            if (i < word1Len) {
                merged += word1.charAt(i);
            }
            if (i < word2Len) {
                merged += word2.charAt(i);
            }
        }
        
        return merged;
        
    }
}