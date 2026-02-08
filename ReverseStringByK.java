public class ReverseStringByK {
    public static void main(String[] args) {
        String s="abcdefg";
         int k=4;
       char[] arr = s.toCharArray();
         
        int n= arr.length;
  
        for(int st=0;st<n;st=st+(2*k)){
            
            int left=st;
            int rt=Math.min(st+k-1, n-1);

            while(left<rt){
                 char temp = arr[left];
                arr[left] = arr[rt];
                arr[rt] = temp;
                left++;
                rt--;
            }
        }

        System.out.println(arr);
    }
}
