import java.util.*;
public class Search2D {
    
    static int search(int[][] nums)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]>max){
                    max=nums[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        
        int[][] a={{1,34,24},{234,25,2346,123,12},{12,89,987,34}};
        System.out.println("The highest number is :"+search(a));
    
    }
}
