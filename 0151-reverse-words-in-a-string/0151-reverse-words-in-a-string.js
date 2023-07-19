/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let reversedArr = s.split(" ");
    reversedArr.reverse();
    let newArr = [];
    reversedArr.forEach(word => {
        if (word !== "") {
            newArr.push(word);
        }
    });
    return newArr.join(" ");
};