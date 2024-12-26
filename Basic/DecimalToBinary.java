import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class DecimalToBinary {

static int convert(int num){
    int rem,ans=0;
    while(num!=0){
    rem=num%2;
    ans=ans*10+rem;
     num=num/2;
    }
  
    return ans;
}
    public static void main(String[] args) {
        System.out.println("Binary number of given decimal digits is:"+convert(10));
    }
}