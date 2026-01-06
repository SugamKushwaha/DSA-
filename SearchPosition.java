import java.util.Scanner;

public class SearchPosition{

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i; // return the position
            }
        }
        return nums.length; // if target is greater than all
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchPosition obj = new SearchPosition();

        String[] parts = sc.nextLine().split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        int target = sc.nextInt();
        int result = obj.searchInsert(nums, target);
        System.out.println(result);

        sc.close();
    }

   
    // public static void main(String[] args) {

    //     int [] nums = {2,4,6,8,12,15};
    //     int target = 14;
        
    //     for(int i=0;i<nums.length;i++){
    //         if(target <= nums[i]){
    //             //  nums[i]=target;
    //              System.out.println(i);
    //             return ;
    //         }
    //         System.out.println(nums.length);
    //         return;
    //     }
    // }
}