
import java.util.Arrays;


public class Add1inArray {
 
    public static void main(String[] args) {
     int[] arr = {9,8,9};
       
        int n = arr.length;

        // Start from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                return ;
            }
            arr[i] = 0;
        }

        // If all digits were 9 (e.g. [9,9,9])
        int[] result = new int[n + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
   }

