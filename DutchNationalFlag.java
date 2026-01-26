import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        
        int []num = {2,0,2,1,1,0};

         int l=0;
        int m=0;
        int h=num.length-1;

        int temp;

        while(m<h){
            if(num[m]==0){
                temp=num[l];
                num[l]=num[m];
                num[m]=temp;
                m++;
                l++;
            }
            else if(num[m]==1){
                temp = num[h-1];
                num[h-1]=num[m];
                num[m]=temp;
                m++;
            }else if(num[m]==2){
                temp = num[h];
                num[h]=num[m];
                num[m]=temp;
                h--;
            }
        }
        System.out.println(Arrays.toString(num));
    }
    
}
