class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        System.out.println(trimmed);
        int count = 0;
        
        for(int i = trimmed.length() - 1; i >= 0; i--) {
            if (trimmed.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        
        return count;
    }
}