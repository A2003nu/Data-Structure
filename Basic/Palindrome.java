import java.util.*;
class Palindrome {
    static boolean pali(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
        e--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        
        String a="baab";
        if(pali(a)){
        System.out.println("IT is palindrome");
    }
    else{
        System.out.println("IT is not palindrome");
    }
    }
    }
