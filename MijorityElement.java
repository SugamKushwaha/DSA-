public class MijorityElement {
    
    public static void main(String[] args) {
        int []nums = {2,2,1,3,4,2,5,2};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums.length; j++) {
                 if(i ==j ){
                    count++;
                 }
             }
             System.out.print(count + " " );
        }
    }
}
