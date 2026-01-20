public class SingalNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        int j=0;
       for(int i=0;i<nums.length;i++){
            j = j^nums[i];
       }
       System.out.println(j);
    }
}
