import java.util.Arrays;

public class SorteSqureArray {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){j++;}else{k++;}}
         int arr1[] = new int[j];
        int arr2[] = new int[k];


        int n=0;
        int p=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
            arr1[n]=nums[i]*nums[i];n++;
            }else{
                arr2[p] = nums[i]*nums[i];p++;
            }
        }   

        int i = 0;
int len = arr1.length - 1;

while(i < len){
    int temp = arr1[i];
    arr1[i] = arr1[len];
    arr1[len] = temp;
    i++;
    len--;
}
       int arr[]= new int[arr1.length+arr2.length];
       int d=0;
      int h=0;
      int g=0;
      while(g<arr1.length && h <arr2.length){
            if(arr1[g]<arr2[h]){
                       arr[d]=arr1[g];
                       d++;
                       g++;
                       
                 }  else{
                    arr[d]=arr2[h];
                    h++;
                    d++;
                 }
      }while(g < arr1.length){
    arr[d] = arr1[g];
    d++;
    g++;
}

while(h < arr2.length){
    arr[d] = arr2[h];
    d++;
    h++;
}
      
    System.out.println(Arrays.toString(arr));
    }
    
} 
