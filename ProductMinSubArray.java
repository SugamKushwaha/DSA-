public class ProductMinSubArray {
    public static void main(String[] args) {
        int arr[] ={10,5,2,6};
        int l=0;
        int h=0;
        int i=0;
        int k=100;
        int p=1;

        while(h<=arr.length || l<=arr.length){
               p=arr[l]* arr[h];
               if(p>k){
                l++;
                i++;
                h--;
               }else if(p<k && h<arr.length){
                h++;
                i++;
               }
               else{
                l++;
                i++;
               }
        }

        System.out.println(i);
    }
}
