class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<1){
            return 0;
        }
         int freq[]=new int[256];
        int low =0;
        int res=0;

        for(int high =0;high<s.length();high++){
            freq[s.charAt(high)]++;
            while(freq[s.charAt(high)]>1){
                 freq[s.charAt(low)]--;
                low++;
            }
             int len=high-low+1;  
             if(len>res){
                res=len;
             }
        }
        return res;
    } 
} 