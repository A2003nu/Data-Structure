import java.util.*;
class FindHighest {
    static int high(int[] a){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(a[mid]>a[mid+1])
            {
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return a[e];
    }
    
    
    
    public static void main(String[] args) {
      int[] arr={10,14,16,17,19,22,24,33,21,16,11,4};
      System.out.println("Highest(Peak) element is:"+high(arr));
    }
}