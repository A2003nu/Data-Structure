import java.util.*;
import java.lang.*;
import java.io.*;

public class BinarySearch{

static int Search(int[] arr,int tar){
    int start=0;
    int len=arr.length;
    int end=len-1;
    int mid=start+(end-start)/2;
    while(start<=end){
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[mid]>tar){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
}
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int[] arr={12,32,43,54,68,75,89,100};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to be searched:");
        int tar=sc.nextInt();
        int ans=Search(arr,tar);
        System.out.println("The index of element is:"+ans);
    }
}