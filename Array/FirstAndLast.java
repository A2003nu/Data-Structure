import java.util.*;
class FirstAndLast {
    static int search(int[] arr,int target,boolean findfirst)
    {
        int s=0;
        int ans=-1;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else{
                ans=mid;
            
            if(findfirst){
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
    }
    return ans;
    }
     
    
    
    
    
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,5,5,6,7,7,8};
        int target=7;
        int[] ans={-1,-1};
        ans[0]=search(arr,target,true);
        if(ans[0] !=-1){
            ans[1]=search(arr,target,false);
        }
        System.out.println("The first and last index is:"+Arrays.toString(ans));
    }
}