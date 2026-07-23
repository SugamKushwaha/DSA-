class Solution {
    public int maximumLengthSubstring(String s) {
          int freq[]=new int[256];
        int low =0;
        int res=Integer.MIN_VALUE;

        for(int high =0;high<s.length();high++){
            freq[s.charAt(high)]++;
            while(freq[s.charAt(high)]>2){
                 freq[s.charAt(low)]--;
                low++;
            }
             int len=high-low+1;
              res=Math.max(len, res);
        }
             return res;
    }
}
