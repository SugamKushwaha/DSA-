
import java.util.HashMap;


public class HashMap1 {
    
    public static void main(String[] args) {
        
        String s= "aabccda";

       HashMap<Character,Integer>f= new HashMap<>();

       for(char ch:s.toCharArray()){
        f.put(ch, f.getOrDefault(ch, 0)+1);
       }
       for(int i=0;i<s.length();i++){
        if(f.get(s.charAt(i))==1){
            System.out.println(i);
        }
       }
    }
}
