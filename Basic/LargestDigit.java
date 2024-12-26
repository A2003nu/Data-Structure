import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class LargestDigit{

static int large(int num){
    int rem,max=Integer.MIN_VALUE;
    while(num!=0){
        rem=num%10;
        if(rem>max){
            max=rem;
        }
        num=num/10;
    }
    return max;
}
    public static void main(String[] args) {
        System.out.println("Maximum digit is:"+large(1234458));
    }
}