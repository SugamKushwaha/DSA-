public class ContainDuplicate {

      public boolean containsDuplicate(int[] nums) {
         boolean k=false;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(i==j){
                   k=true;
                }else{
                    k=false;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
          ContainDuplicate c = new ContainDuplicate();
          int nums[] = {1,2,3,1};
          c.containsDuplicate(nums);
    }
}
