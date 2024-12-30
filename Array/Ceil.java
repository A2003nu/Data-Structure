import java.util.*;
class Ceil{
    static int ceil(int[] a,int target){
        int s=0,mid;
        int e=a.length-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(target>a[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return a[s];
    }
    
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println("The floor value is:"+ceil(arr,35));
    }
}