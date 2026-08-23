class Solution {
    public boolean isAnagram(String s1, String s2) {
        // Early exit if lengths differ
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Directly compare the sorted character arrays
        return Arrays.equals(s1Array, s2Array);
    }
}