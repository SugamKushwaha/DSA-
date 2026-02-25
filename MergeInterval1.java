import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval1 {
    public static void main(String[] args) {
        int[][] a={{1,3},{2,6},{8,10},{15,18}};
         ArrayList<int[]> l = new ArrayList<>();
        int s1 = a[0][0];
        int e1 = a[0][1];
        for(int i = 1; i < a.length; i++) {
            int s2 = a[i][0];
            int e2 = a[i][1];
            if(e1 >= s2) {
                e1 = Math.max(e1, e2);
            } else {
                l.add(new int[]{s1, e1});
                s1 = s2;
                e1 = e2;
            }
        }
        l.add(new int[]{s1, e1});
        System.out.println(Arrays.deepToString(l.toArray(new int[l.size()][])));
    
    }
    
}
