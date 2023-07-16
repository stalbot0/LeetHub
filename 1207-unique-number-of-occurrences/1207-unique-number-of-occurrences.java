class Solution {
    public boolean uniqueOccurrences(int[] arr) {
//         put each of the integers in a hashmap as the key and then get the count of each of the integers as the value. THEN we will compare the sizes of the hashmap and HashSet
        HashMap<Integer, Integer> hashy = new HashMap<>();
        for (Integer n : arr) {
            hashy.put(n, hashy.getOrDefault(n, 0) + 1);
        }
//         put in a HashSet the unique occurrences of the values
        HashSet<Integer> uniqueValues = new HashSet<>(hashy.values());
        
        return hashy.size() == uniqueValues.size();
    }
}