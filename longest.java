import java.util.*;

class longest{
  public int maxlen(String s){
      int left =0;
      int right =0;
      int maxlen =0;
      HashSet<Character> hs = new HashSet<>();
      while(right<s.length()){
         if(!hs.contains(s.charAt(right))){
            hs.add(s.charAt(right));
            right++;
            maxlen = Math.max(maxlen, hs.size());
         }else{
            hs.remove(s.charAt(right));
            
            left++;
         }
      }
      return maxlen;
   }

  public static void main(String[] args){
   String s = "pwwkew";
   longest l = new longest();
   int x = l.maxlen(s);
   System.out.println(x);
  }
}