
public class RemoveDuplicate {
    static int remove(int[] arr){
        int n=arr.length;
    int k=1;
   
        if(n<=1){
            return n;
        }
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
    }
    return k;
    }



    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,6,6,7,8,8};
        int ans=remove(arr);
        for(int i=0;i<ans;i++){
            System.out.print(arr[i]+" ");
        }
        }

    }

