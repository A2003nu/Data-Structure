public class MoveZeros {
    
static  void pushzeros(int[] a){
    int count=0;
    int n=a.length;
    for(int i=0;i<n;i++){
        if(a[i]!=0){
            a[count]=a[i];
            count=count+1;
        }
    }
    while(count<n){
        a[count]=0;
        count=count+1;
    }
}
    public static void main(String[] args) {
        int[] arr={2,3,5,9,0,7,0,10,11};
        pushzeros(arr);
       for(int num:arr){
        System.out.print(num+" ");
       }
    }
}
