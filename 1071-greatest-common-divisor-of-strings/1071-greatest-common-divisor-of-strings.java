class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int s1Len = str1.length();
        int s2Len = str2.length();
        
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } else if (s1Len == s2Len && str1.equals(str2)) {
            return str2;
        } else {
            // write code for all 'normal' test cases
            int minLen = Math.min(s1Len, s2Len);
            
            int GCD = 0;
            
            for (int i = 1; i <= minLen; i++) {
                if (s1Len % i == 0 && s2Len % i == 0) {
                    GCD = i;
                }
            }
            
            return str2.substring(0, GCD);
        }
    }
}