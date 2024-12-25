import java.util.*;
import java.lang.*;
import java.io.*;

public class Reverse{
    public static int reverse(int num){
        int rem,ans=0;
        while(num!=0){
            rem=num%10;
            ans=ans*10+rem;
            num=num/10;
            
    }
        return ans;
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Number in reverse order:"+reverse(1234));
}

}