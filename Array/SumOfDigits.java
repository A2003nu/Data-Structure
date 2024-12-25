import java.util.*;
import java.lang.*;
import java.io.*;

 class SumofDigits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
       int num=sc.nextInt();
        while(num>9){
            int rem=0,ans=0;
            while(num!=0){
                rem=num%10;
                ans=ans*10+rem;
                num=num/10;
            }
             num=ans;
        }
       System.out.println("The Sum of Integers is:"+num);
    }
}