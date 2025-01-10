public class Stock {
    static int maxProfit(int[] a){
        int min=a[0];
        int res=0;
        for(int i=0;i<a.length;i++){
        min=Math.min(min,a[i]);
        res=Math.max(res,a[i]-min);
    }
    return res;
}

    public static void main(String[] args) {
        int[] arr={10,1,3,6,9,2};
        System.out.println("Profit:"+maxProfit(arr));
    }
}
