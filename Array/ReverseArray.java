import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseArray{

    static void reverse(int[] a){
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
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}