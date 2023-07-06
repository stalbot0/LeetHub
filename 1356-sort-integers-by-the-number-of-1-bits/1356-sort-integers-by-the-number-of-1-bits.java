class Solution {
    public int[] sortByBits(int[] arr) {
//         we want to iterate through the array and return the bit count at that same index. We can multiply by any number larger than 10000 because of the restraints. This will produce values which we can then get the remainder from, giving us the number of 1 bits in the array at the same index
        for (int i = 0; i < arr.length ; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 90000;
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 90000;
        }
        
        return arr;
    }
}