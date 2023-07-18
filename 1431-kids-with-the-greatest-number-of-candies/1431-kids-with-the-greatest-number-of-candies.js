/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const maxCandies = Math.max(...candies);
    const bools = candies.map(candy => candy + extraCandies >= maxCandies);
    return bools;
//     var maxCandies = candies[0];
//     for (let i = 1; i <= candies.length; i++) {
//         if (candies[i] > maxCandies) {
//             maxCandies = candies[i];
//         }
//     }
//     var bools = [];
//     candies.forEach(function(candy) {
//        if (candy + extraCandies >= maxCandies) {
//            bools.push(true);
//        } else {
//            bools.push(false);
//        }
//     });
    
//     return bools;
};