
public class Add1inArray {
 
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,0};
        int[] arr1 = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
             j = j*10 + arr[i];
        }
        int k=j+1; //124

        System.out.println(k);

        for (int i = 0; i < arr.length; i++) {
                 int l= k % 10; //4,2,1
                 k = k/10;
                 arr1[i] = l;
        }
    
        System.out.println(Arrays.toString(arr1));

    }
}
