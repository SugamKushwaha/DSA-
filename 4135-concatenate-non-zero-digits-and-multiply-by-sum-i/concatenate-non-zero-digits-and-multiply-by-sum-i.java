class Solution {
    public long sumAndMultiply(int n) {
        long res=0;
        long r=1;
        long sum=0;
        long m;
        
        while(n>0){
            int s=n%10;
            if(s!=0){
                res= r*s+res;
                r*=10;
                sum+=s;
            }
            n/=10;
        }
        m=res*sum;
       return m;
    }
}