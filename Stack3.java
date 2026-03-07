import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
       String word="abcdefd";
       char ch='p';
       String res="";
       boolean f= false;
    Stack<Character> st = new Stack<>();
          for(int i=0;i<word.length();i++){
              if(!f && word.charAt(i)==ch){
                 st.push(word.charAt(i));
                 while(!st.isEmpty()){
                 res +=st.pop();
               }
               f=true;
              }
              else if(!f){
                st.push(word.charAt(i));
              }
              else{
                res+=word.charAt(i);
              }
          }
         if(!f){
            for(int i = 0; i < st.size(); i++){
                res += st.get(i);  
            }
        }
          System.out.println(res);
    }
}

