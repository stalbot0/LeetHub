class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        String s = Integer.toString(x);
        int endPointer = s.length() - 1;
        System.out.println(endPointer);
    
        for(int i=0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(endPointer)) {
                return false;
            } else {
                endPointer--;
            }
        }
        
        return true;
    }
}