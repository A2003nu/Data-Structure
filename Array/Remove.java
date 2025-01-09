public class Remove{

    static int remove(int[] a,int k){
        int n=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=k){
                a[n]=a[i];
                n++;
            }
        }
        return n;
    }

    public static void main(String args[]){
        int[] arr={1,2,3,0,3,4,1};
        int k=3;
        System.out.println("No of elements not equal to k:"+remove(arr,k));
    }
}