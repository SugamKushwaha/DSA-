import java.util.Arrays;

public class PreFixSum3 {

      public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int []arr=new int[nums.length];

          int pre=1;
          for(int i=0;i<nums.length;i++){
               arr[i]=pre;
               pre *=nums[i];
          }
          int suff =1;
          for(int i=nums.length-1;i>=0;i--){
            arr[i]*=suff;
            suff=suff * nums[i];
          }
          System.out.println(Arrays.toString(arr));
      }    
}
