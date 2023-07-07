class Solution {
    public String reverseWords(String s) {
//         remove trailing and leading whitespace
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        // System.out.println(s);
        
        List<String> wordsList = Arrays.asList(s.split(" "));
        Collections.reverse(wordsList);
        
        s = String.join(" ", wordsList);
        
        return s;
    }
}