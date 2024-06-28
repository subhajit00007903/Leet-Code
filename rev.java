public class rev {
   public int reverse(int x) {
      int num = x;
      long rev = 0;
      while(num!=0){
          int rem = num %10;
          rev = rev*10+rem;
          num = num/10;
      }
      //This If Part  check the rev value if it is Exiting Interger.MAX_VALUE oR Interger.MIN_VALUE
      if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
          return 0;
      }
      return(int)rev;
   
      }
}


