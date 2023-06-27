class Solution {
    public int numberOfSteps(int num) {
        int sum = 0;
        int newNum = num;
        
        while (newNum > 0) {
           if(newNum % 2 == 0) {
                sum++;
                newNum = newNum / 2;
            }

            if(newNum % 2 != 0) {
                sum++;
                newNum = newNum - 1;
            }
        }
        
        return sum;
    }
}