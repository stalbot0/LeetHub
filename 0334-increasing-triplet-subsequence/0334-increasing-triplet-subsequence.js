/**
 * @param {number[]} nums
 * @return {boolean}
 */
var increasingTriplet = function(nums) {
    var num1 = Number.MAX_VALUE;
    var num2 = Number.MAX_VALUE;
    
    for(let i = 0; i < nums.length; i++) {
        if (nums[i] <= num1) {
            num1 = nums[i];
        } else if (nums[i] <= num2) {
            num2 = nums[i];
        } else {
            return true;
        }
    };
    
    return false;
};