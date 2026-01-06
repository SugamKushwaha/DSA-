public class MissingElementArray {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                if((i+1)!=j){
                   System.out.print(arr[i]);
                   return;
                }
            }
        }

    }
}
