class Solution {
    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <=right; i++){
            String s = words[i];
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length()-1);
            if(isVowel(firstChar) && isVowel(lastChar)) count++;
        }
        return count;
    }
}