class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (j < chars.length) {
            if (chars[i] == chars[j]) {
                j++;
            } else {
                // replace arr
                chars[k] = chars[i];
                k++;

                // check for count > 1 then do the 
                int count = j - i;
                if (count > 1) {
                    // convert count into string
                    String s = Integer.toString(count);
                    for (char ch : s.toCharArray()) {
                        chars[k] = ch;
                        k++;
                    }
                }

                i = j;
            }
            

        }
        // for last grp
        chars[k] = chars[i];
        k++;
        int count = j - i;

        // check for count > 1 then do the 
        count = j - i;
        if (count > 1) {
            // convert count into string
            String s = Integer.toString(count);
            for (char ch : s.toCharArray()) {
                chars[k] = ch;
                k++;
            }
        }
        return k;
    }
}