class Solution {
    public boolean isAnagram(String s1, String s2) {
        // Early exit if lengths differ
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < s2.length(); i++){
            if(!map.containsKey(s2.charAt(i))) return false;
            int freq = map.get(s2.charAt(i));
            
            if( freq== 0) return false;
            
            map.put(s2.charAt(i), freq - 1 );
        }
        return true;
    }
}