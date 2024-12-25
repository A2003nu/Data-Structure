import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxMin{

   public static int max(int[] a){
       int s=0;
        int e=a.length-1;
       int max=Integer.MIN_VALUE;
       for(int i=s;i<=e;i++){
           if(a[i]>max){
               max=a[i];
           }  
       }
    return max;
   }

  public static int min(int[] a){
        int s=0;
        int e=a.length-1;
        int min=Integer.MAX_VALUE;
      for(int i=s;i<=e;i++){
          if(a[i]<min){
              min=a[i];
          }
      }
      return min;
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int[] arr={4,5,8,6,2,9,14};
        System.out.println("The Maximum element is:"+max(arr));
        System.out.println("The Minimum element is:"+min(arr));
        
        
    }
}