class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr1[]=new int[code.length];
         int n = code.length;

       for (int start = 0; start < n; start++) {
        int sum=0;
         if(k>0){
             for (int j = 1; j <= k; j++) {
            int i = (start + j) % n;
             sum+=code[i];
       }
        arr1[start]=sum;
         }
         if(k==0){
            int i=0;
            while(i<n){
                arr1[i]=0;
                i++;
            }
         }
         if(k<0){
            int m=Math.abs(k);
             for (int j = 1; j <= m; j++) {
        int i = (start - j + n) % n;
        sum += code[i];
    }
       arr1[start] = sum;
         }
     }
     return arr1;
    }
}