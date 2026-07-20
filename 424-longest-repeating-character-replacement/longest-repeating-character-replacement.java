class Solution {
    private int find(int[] freq) {
        int max = 0;
        for (int x : freq) {
            max = Math.max(max, x);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int low=0;
        int res=0;
        for(int high=0;high<s.length();high++){
             freq[s.charAt(high)-'A']++;
             int len=high-low+1;
             int max=find(freq);
             int diff=len-max;

             while(diff > k){
                freq[s.charAt(low)-'A']--;
                low++;
                len = high-low+1;
                max=find(freq);
                diff = len-max;
             }
             res=Math.max(res,len);
        }
        return res;
    }
}