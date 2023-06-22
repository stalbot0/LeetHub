class Solution {
    public void reverseString(char[] s) {
//         start by creating integers that represent the left and right indeces of the char[]
        int left = 0;
        int right = s.length - 1;
//         as we increment from the left and decrement from the right, eventually the left and the right
//         will meet in the middle, which is why we choose the while loop that continues while the left is 
//         LESS than the right
        while(left < right) {
//             here we are assigning a temporary character to the left index of array s
            char temporary = s[left];
//             this then assigns the character at the right to the incrementation on the left
            s[left++] = s[right];
//             finally, it assigns the temporary char value to the right side of the array s as it decrements
            s[right--] = temporary;
        }
    }
}