class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1 = 0, w2 = 0; // Pointers for the current word in the array
        int i = 0, j = 0;   // Pointers for the current character in the word

        while (w1 < word1.length && w2 < word2.length) {
            // If characters don't match, return false immediately
            if (word1[w1].charAt(i) != word2[w2].charAt(j)) {
                return false;
            }
            
            i++;
            j++;
            
            // If we reached the end of the current word in word1, move to the next word
            if (i == word1[w1].length()) {
                w1++;
                i = 0;
            }
            // If we reached the end of the current word in word2, move to the next word
            if (j == word2[w2].length()) {
                w2++;
                j = 0;
            }
        }
        
        // Return true if both arrays are fully traversed at the same time
        return w1 == word1.length && w2 == word2.length;
    }
}