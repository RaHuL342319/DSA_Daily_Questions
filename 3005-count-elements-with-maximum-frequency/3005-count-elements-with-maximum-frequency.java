class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }
        // search for maxFreq
      // find max frequency
     int maxFreq = 0;
     for(int count :freq.values()){
        maxFreq = Math.max(maxFreq,count);
     }
    //  if val == max freq,add it in answer
    int answer = 0;
    for(int count : freq.values()){
        if(count == maxFreq){
            answer += count;
        }
    }
    return answer;
    }
}