
public class recursivePrinting {
    public static void main(String[] args) {
        int[]arr={5,56,86,54,14,7,6};
        recPrint(arr,0);
    } 
    public static void recPrint(int[] arr,int idx){
        int n=arr.length;
        if(idx==n)return ;
        System.out.print(arr[idx]+" ");
        
        recPrint(arr, idx+1);
       
        System.out.print(arr[idx]+" ");
    }
}
