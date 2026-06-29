

public class Stack1 {
    public static void main(String[] args) {
             String s="abbaca";
         char[] ch = s.toCharArray();

         StringBuilder sb = new StringBuilder();

         for(int i=0;i<ch.length;i++){
            int len = sb.length();

            if (len>0 && s.charAt(len-1)==ch[i]){
               sb.deleteCharAt(ch[i]);
            }else{
               sb.append(ch[i]);
            }
         }
 
         System.out.println(sb.toString());
       
    }
}
//   String a="suugam";
//           String res="";
//         Stack<Character> st = new Stack<>();

//           for(int i=0;i<a.length();i++){
//              if(st.isEmpty()){
//                 st.push(a.charAt(i));
//                 continue;
//              }
//              if(st.peek()==a.charAt(i)){
//                 st.pop();
//                 continue;
//              }
//              st.push(a.charAt(i));
//           }
//           while(!st.isEmpty()){
//              res+= st.peek();
//              st.pop();
//           }

//           System.out.println(res);