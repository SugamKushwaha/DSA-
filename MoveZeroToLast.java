
import java.util.Arrays;

public class MoveZeroToLast {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
             if(nums[i] ==0){
                int k = nums[i];
                  nums[i]=nums[j];
                  nums[j]=k;

                  j--;
             }
        }
        System.out.println(Arrays.toString(nums));
    }
}
