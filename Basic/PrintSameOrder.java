import java.util.*;
import java.lang.*;
import java.io.*;

public class PrintSameOrder{
    public static int print(int num){
        int rem,mul=1,ans=0;
        while(num!=0){
            rem=num%10;
            ans=rem*mul+ans;
            mul=mul*10;
            num=num/10;
        }
        return ans;
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        
    System.out.println("The number in same order:"+print(1254));
}
}