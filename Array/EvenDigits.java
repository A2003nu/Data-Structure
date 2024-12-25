import java.util.*;
import java.lang.*;
import java.io.*;

public class EvenDigits{

    public static boolean binary(int num){
        int n=0;
        while(num!=0){
            num=num/10;
            n++;
        }
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int[] arr={12,125,45,786,23,1245,12345,14752};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(binary(arr[i])){
                count++;
            }
        }
        System.out.println("The number of even digits elements are:"+count);
    }
}