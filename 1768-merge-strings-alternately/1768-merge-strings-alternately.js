/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    // word1.replace("/\s+/g", "").trim();
    // word2.replace("/\s+/g", "").trim();
    var maxLength = Math.max(word1.length, word2.length);
    var s = "";
    
    for (i = 0; i < maxLength; i++) {
        if (i < word1.length) {
           s += word1[i];
        }
        if (i < word2.length) {
            s += word2[i];
        }
    }
    
    return s;
};