
import java.util.HashMap;

public class MaxNumberArray {
    public static void main(String[] args) {
        int[] a={1,2,3};
       int sum=0;
       int k=3;

       int res=0;
       HashMap<Integer,Integer> f = new HashMap<>();
               f.put(0, 1); 
          for (int i = 0; i < a.length; i++) {
              sum += a[i];
              int q = sum - k;
              int fre = f.getOrDefault(q, 0);  
              res += fre;
              f.put(sum, f.getOrDefault(sum, 0) + 1);  
          }
           System.out.println(res);
    }
}
