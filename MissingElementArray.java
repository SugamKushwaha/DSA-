public class MissingElementArray {
    
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6};
 
        
        int a=(arr.length+1) * ((arr.length+1) + 1)/2;
        System.out.println(a);
         int sum =0;
        for(int i=0;i<arr.length;i++){
             sum = sum+arr[i];
        }
        
        int result = a-sum;

        System.out.println(result);
        

    }
}
