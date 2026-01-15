public class MissingElementArray {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,2};

        int a=(arr.length+1) * ((arr.length+1) + 1)/2;
         int sum =0;
        for(int i=0;i<arr.length;i++){
             sum = sum+arr[i];
        }
        
        int result = a-sum;

        System.out.println(result);
        

    }
}
