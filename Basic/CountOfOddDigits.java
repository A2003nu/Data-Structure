import java.util.*;
import java.lang.*;
import java.io.*;

public class CountOfOddDigits{
    public static int count(int num){
        int count=0,rem;
        while(num!=0){
            rem=num%10;
            if(rem%2==1){
                count++;
            }
            num=num/10;
            
    }
        return count;
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Number of odd digits in number is:"+count(555));
}

}