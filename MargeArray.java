public class MargeArray{
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] num = {nums1.length + nums2.length};

        for(int i=0;i>nums1.length;i++){
            if(nums1[i] > 0){
                 m++;
            }
        }
         for(int i=0;i>nums1.length;i++){
            if(nums2[i] > 0){
                 n++;
            }
        }
    }
    public static void main(String [] args){

        System.out.println();
    }
}