class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {   
        for(int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i); //store the character in r at index i
            int matchingIndex = magazine.indexOf(r); // get the index of the match in magazine
            
            if(matchingIndex == -1) { // if the matching index doesnt exist return false
                return false;
            }
            
            //magazine now points to magazine with a substring at index 0 to the first matching index, then added is the magazine at the index of the first match + 1 to continue until it ends
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }
    
        return true;
    }
}