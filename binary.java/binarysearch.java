import java.util.Scanner;
public class binarysearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
  for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target: ");
        int t=sc.nextInt();
        int lo=0,hi=n-1;
        while(lo<=hi){ 
           int mid=(lo+hi)/2;
         if(t==arr[mid]){
            System.out.println(arr[mid]);
         }
         else if(t>arr[mid]){
            lo=mid+1;
         }
         else if(t<arr[mid])
            hi=mid-1;
        System.out.println(mid);
        }
        sc.close();
    }
}
