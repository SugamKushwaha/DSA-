import java.util.HashMap;

public class PreFixSum2 {
    public static void main(String[] args) {
        int a[]={4,5,0,-2,-3,1};
int k=5;
         HashMap<Integer,Integer> f = new HashMap<>();
         f.put(0, 1); 
         int count=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
            int rem=sum%k;

            if(rem<0){
                rem +=k;
            }
             if (f.containsKey(rem)) {
                count += f.get(rem);
            }
            f.put(rem, f.getOrDefault(rem, 0)+1);
        }
        System.out.println(count);

    }
    
}
