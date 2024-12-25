import java.util.*;
import java.lang.*;
import java.io.*;

public class Armstrong{
    public static int order(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean armstrong(int num){
        int degree=order(num);
        int original=num;
        int rem,ans=0;
        while(num!=0){
            rem=num%10;
            ans+=Math.pow(rem,degree);
            num=num/10;
        }
        if(ans==original){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int number=153;
    if(armstrong(number)){
    System.out.println("The number is armstrong");
}
        else{
            System.out.println("The number is not armstrong");
        }

}
}