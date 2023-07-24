class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap <String,Integer> hashy = new HashMap <String,Integer>();
    
        int i = 0;
        for (char c : keyboard.toCharArray()){
            hashy.put(Character.toString(c), i++);
        }
    
        char prevChar = word.charAt(0);
        int totalTime = hashy.get(Character.toString(prevChar));
    
        for (char c : word.toCharArray()) { 
            totalTime = totalTime + Math.abs(hashy.get(Character.toString(c)) - hashy.get(Character.toString(prevChar)));
            prevChar = c;
        }
        return totalTime; 
    }
}