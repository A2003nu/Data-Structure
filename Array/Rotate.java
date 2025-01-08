public class Rotate {
    static void rotate(int[] a,int d){
        int n=a.length;
        for(int i=0;i<d;i++){
            int first=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=first;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=2;
        rotate(arr,d);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
