class Solution {
    public String mergeAlternately(String word1, String word2) {
//         given to strings, replace all of the spaces to condense the words
        word1.replaceAll(" ", "");
        word2.replaceAll(" ", "");
//         get the max length so that way we can iterate to the very end
        int max = Math.max(word1.length(), word2.length());
        String merge = "";
//         iterate through, check the conditions, and concat to the string
        for(int i = 0; i < max; i++) {
            if (i < word1.length()) {
                merge += word1.charAt(i);
            }
            
            if (i < word2.length()) {
                merge += word2.charAt(i);
            }
        }
        return merge;
    }
}