import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        

        char[] c = {'h','e','l','l','o'};
             int  b=c.length-1;

        for(int i=0; i<b; i++){
            char a=c[b];
            c[b] =c[i];
            c[i]=a;
            b--;
        }

        System.out.println(Arrays.toString(c));
        
    }
    
}
