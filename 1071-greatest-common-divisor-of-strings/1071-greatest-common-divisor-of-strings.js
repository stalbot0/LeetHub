/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */
var gcdOfStrings = function(str1, str2) {
    var str1Length = str1.length;
    var str2Length = str2.length;
    
    if (str1 + str2 !== str2 + str1) {
        return "";
    } else if (str2 === str1) {
        return str2;
    } else {
        var gcd = 0;
        var minLength = Math.min(str1.length, str2.length);
        for (let i = 1; i <= minLength; i++) {
            if (i !== 0 && str2.length % i === 0 && str1.length % i === 0) {
                gcd = i;
            }
        }
        return str2.substring(0, gcd);
    }
};