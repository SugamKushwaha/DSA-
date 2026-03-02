
import java.util.Stack;

public class Stack2 {

    public static void main(String[] args) {
        String s="]()[]{}";
        boolean f=false;

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                 st.push(s.charAt(i));
                 continue;
            }
            
           if(!st.isEmpty()){
             if(st.peek()=='(' && s.charAt(i)==')'){
                st.pop();
                continue;
            }
            if(st.peek()=='{' && s.charAt(i)=='}'){
                st.pop();
                continue;
            }
            if(st.peek()=='[' && s.charAt(i)==']'){
                st.pop();
                continue;
            }
           }
   
            st.push(s.charAt(i));
        }
        if(st.isEmpty()){
            f=true;
        }else{
            f=false;
        }
        System.out.println(f);
    }
    
}
