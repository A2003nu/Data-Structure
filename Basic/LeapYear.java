class LeapYear{

static boolean check(int num){
    if(num % 400 == 0){
        return true;
    }
    else if(num % 4 == 0 && num % 100 != 0 ){
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String[] args) {
        int n=2019;
        if(check(n)){
        System.out.println("It is a leap year");
    }
        else{
            System.out.println("It is not a leap year");
        }
    }
}