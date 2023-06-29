class Solution {
    public int strStr(String haystack, String needle) {
        int firstIndex = 0;
        
        if(!haystack.contains(needle)) {
            firstIndex = -1;
        } else {
            firstIndex = haystack.indexOf(needle);
        }
        
        return firstIndex;
    }
}