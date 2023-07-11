class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        //iterate through char array (responsible for each set of identical characters)
        while(i < chars.length){
            int j = i;

            //find the length of the 
            while(j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            // store current character at compressed index
            chars[index++] = chars[i];

            // if there are more than 1 identical characters, store their count
            if(j - i > 1) {
                String count = j - i + "";
                for (char c: count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            //move to the next set of characters
            i = j;
        }

        //return the index
        return index;
    }
}