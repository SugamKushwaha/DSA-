import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {

          String a="suugam";
          String res="";
        Stack<Character> st = new Stack<>();

          for(int i=0;i<a.length();i++){
             if(st.isEmpty()){
                st.push(a.charAt(i));
                continue;
             }
             if(st.peek()==a.charAt(i)){
                st.pop();
                continue;
             }
             st.push(a.charAt(i));
          }
          while(!st.isEmpty()){
             res+= st.peek();
             st.pop();
          }

          System.out.println(res);
    }
}
