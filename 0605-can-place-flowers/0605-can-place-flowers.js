/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
    var plantedFlowers = 0;
    for (let i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] === 0) {
            var emptyLeft = ((i === 0) || (flowerbed[i - 1] === 0));
            var emptyRight = ((i === flowerbed.length - 1) || (flowerbed[i + 1] === 0));
            
            if (emptyLeft && emptyRight) {
                flowerbed[i] = 1;
                plantedFlowers++;
            }
        }
    }
    return plantedFlowers >= n;
};

// var canPlaceFlowers = function(flowerbed, n) {
//     flowerbed.unshift(0); // Add a boundary element at the beginning
//     flowerbed.push(0); // Add a boundary element at the end
    
//     var plantedFlowers = 0;
//     for (let i = 1; i < flowerbed.length - 1; i += 2) {
//         if (flowerbed[i] === 0 && flowerbed[i - 1] === 0 && flowerbed[i + 1] === 0) {
//             flowerbed[i] = 1;
//             plantedFlowers++;
//         }
//         if (plantedFlowers >= n) {
//             return true; // Early exit if the required number of flowers has been planted
//         }
//     }
    
//     return plantedFlowers >= n;
// };