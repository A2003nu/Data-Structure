import java.util.*;
import java.lang.*;
import java.io.*;

public class CountOfDigits{
    public static int count(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Number of digits in number is:"+count(121254));
}

}