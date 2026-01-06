import java.util.Arrays;

public class MergeSoretArray {

     public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr2 = new int[m+n];

        int index =0;

        for(int i=0;i<nums1.length;i++){
              if(nums1[i] !=0){
                arr2[index++] = nums1[i];
              }
        }
        for(int i=0;i<nums2.length;i++){
              if(nums2[i] !=0){
                arr2[index++] = nums2[i];
              }
        }
           int[] result = Arrays.copyOf(arr2, index);
           for (int i = 0; i < result.length-1; i++) {
                   if(result[i]>result[i+1]){
                       int b = result[i+1];
                       result[i+1] = result[i];
                       result[i] = b;
                       
                   }
           }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int m=arr.length;
        int[] arr1 = {2,7,5,6};
        int n=arr1.length;

        MergeSoretArray mg = new MergeSoretArray();
        mg.merge(arr, m, arr1, n);
    }
}
