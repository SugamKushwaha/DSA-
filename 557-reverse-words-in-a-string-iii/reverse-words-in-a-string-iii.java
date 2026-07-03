class Solution {
    public String reverseWords(String s) {
         String words[] = s.split(" ");

        for(int i=0;i<words.length;i++){
            String s1=words[i];
            char []c=s1.toCharArray();

             int j=0;
             int k=c.length-1;

             while(j<k){
                char c1=c[j];
                c[j]=c[k];
                c[k]=c1;
                j++;
                k--;
             }
             words[i] = new String(c);
        }
        String result = String.join(" ", words);

        return result;
    }
}