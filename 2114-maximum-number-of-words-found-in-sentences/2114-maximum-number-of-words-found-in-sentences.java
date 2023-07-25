class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = sentences[0].split("\\s").length;
        for (int i = 1; i < sentences.length; i++) {
            int comparison = sentences[i].split("\\s").length;
            max = Math.max(max, comparison);
        }
        return max;
    }
}