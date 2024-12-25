import java.util.*;
import java.lang.*;
import java.io.*;

public class LinearSearch{

   public static int Search(int[] a,int n){
       int s=0,i;
        int e=a.length-1;
       if(a.length<0){
           return -1;
       }
    for(i=s;i<=e;i++){
        if(a[i]==n){
            return i;
        }
    }
       return -1;
   }

  public static void reverse(int[] a){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s+=1;
            e-=1;
        }
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("The element is in the position:"+Search(arr,5));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}