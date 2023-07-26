class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordWun = new StringBuilder();
        StringBuilder wordTew = new StringBuilder();
        
        for (String s : word1) {
            wordWun.append(s);
        }
        for (String s : word2) {
            wordTew.append(s);
        }
        
        if (wordWun.toString().equals(wordTew.toString())) {
            return true;
        } else {
            return false;
        }
    }
}