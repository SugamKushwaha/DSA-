class Solution {
    public int maxProduct(int n) {
        int l=Integer.MIN_VALUE;
        int secondL=Integer.MIN_VALUE;

        while(n!=0){
            int r=n%10;
            if(r>l){
                secondL=l;
                l=r;
            }else if (r>secondL) {
                secondL=r;
            }
            n=n/10;
        }
        return l*secondL;
    }
}