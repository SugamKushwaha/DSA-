class Solution {
    public void duplicateZeros(int[] arr) {
       
         int arr1[]=new int[arr.length];
        int i=0;
        int k=0;
        while(i<arr.length && k<arr1.length){
            if(arr[i]!=0){
                arr1[k]=arr[i];
                i++;
                k++;
                continue;
            }
            else if (arr[i]==0) {
                arr1[k] = 0;
                k++;

                if (k < arr1.length) {
                    arr1[k] = 0;
                    k++;
                }

                 i++;
                
            }
        }
        for (int x = 0; x < arr.length; x++) {
    arr[x] = arr1[x];
}
    }
}
