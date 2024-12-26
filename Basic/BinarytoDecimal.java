import java.util.*;
import java.lang.*;
import java.io.*;


class BinarytoDecimal{

static int convert(int num){
    int rem,ans=0,mul=1;
    while(num!=0){
    rem=num%10;
    ans+=rem*mul;
    mul=mul*2;
    num=num/10;
    }
    return ans;
}
    public static void main(String[] args) {
        System.out.println("Decimal number of given binary digits is:"+convert(10101));
    }
}