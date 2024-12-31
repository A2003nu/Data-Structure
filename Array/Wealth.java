import java.util.*;
class Wealth {
    
    static int wealth(int[][] a){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
            if(sum>largest){
                largest=sum;
            }
        }
        return largest;
    }
    
    
    public static void main(String[] args) {
       int[][] arr = {{1,2,4},{2,2,6},{12,4,5},{1,322,42,245,52,42}};
        System.out.println("The highest wealth : "+wealth(arr));
    }
}