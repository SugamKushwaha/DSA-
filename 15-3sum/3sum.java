class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
         List<List<Integer>> res = new ArrayList<>();
        int i;
        int l;
        int r;
        

        for(i=0;i<nums.length-2;i++){

            l=i+1;
             r=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(l<r){
                int sum=nums[l]+nums[r];
            int s=-nums[i];

                if(sum==s){
                     List<Integer> n=new ArrayList<>();
                   n.add(nums[i]);
                   n.add(nums[l]);
                   n.add(nums[r]);

                   res.add(n);

                    l++;
                    r--;
                     while( l<r && nums[l]==nums[l-1]){
                    l++;
                }
               
                while(l<r && nums[r]==nums[r+1]){
                    r--;
                }
                }
                else if(sum<s){
                    l++;
                }else{
                    r--;
                }
               
            }
            
        }
        return res;
    }
}