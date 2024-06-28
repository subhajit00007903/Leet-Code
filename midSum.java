import java.util.Arrays;

public class midSum {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n = nums1.length;
      int m = nums2.length;
      int[] res = new int[n+m];

      System.arraycopy(nums1,0,res,0,n);
      System.arraycopy(nums2,0,res,n,m);

      Arrays.sort(res);

      int totallength = res.length;

      if(totallength%2==0){
          int mid1 = res[(totallength/2) -1];
          int mid2 = res[(totallength)/2];
          double t = (double)mid1 + (double)mid2;
          return t/2;

      }else{
          int mid = res[totallength/2];
          double p = (double)mid;
          return p;

      }
  }
}
