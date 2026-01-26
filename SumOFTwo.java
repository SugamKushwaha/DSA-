public class SumOFTwo {

    public static int[] sum(){
         int arr[] = {2,4,3,1,5,};
        int target = 9;
         int i=0; int j=arr.length-1;
        while(i<j){
            int sum= arr[i]+arr[j];

            if(sum ==  target){
            return new int[];
            }
            if(sum<target){
                i++;
            }
              else if(sum>target){
                j--;
              }


        }
        return 0;
    }
    
    public static void main(String[] args) {
        
       SumOFTwo.sum();
    }
}
