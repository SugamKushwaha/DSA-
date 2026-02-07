import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s= "this is a man";

        String[] c= s.split(" ");

       int b=c.length-1;

       for(int i=0;i<b;i++){
            String a = c[b];
            c[b]=c[i];
            c[i]=a;
            b--;
        }

       System.out.println(Arrays.toString(c));
    }
    
}
