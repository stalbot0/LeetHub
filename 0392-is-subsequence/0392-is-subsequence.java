class Solution {
    public boolean isSubsequence(String s, String t) {
        // my first thought was to use a HashMap for key value pairs, and then check the longer string to see if t contains each character in s. Then I wanted to try out the two pointer method, so here we go....
        int left = s.length(), right = t.length(); 
        int p1 = 0, p2 = 0; //two pointers
        // loop through and check the characters at each pointer, if the characters are equal, move the pointers, if the character at t is not equal, 
        while (p1 < left && p2 < right) {
            // check the condition, move p1 if its equal
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
            }
            // always increment p2 anyway after the condition is checked
            p2++;
        }
        // check to see if the left pointer made it all the way to the end of s, if it didn't then it would return false
        return p1 == left;
    }
}