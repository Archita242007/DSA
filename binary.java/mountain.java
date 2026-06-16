// import java.util.Scanner;
// public class mountain { 
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//          System.out.println("enter no. of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//   for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=1;i<n-1;i++){
//             if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     sc.close();
// }
// }
// 
import java.util.Scanner;

public class mountain { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 

        int lo = 0, hi = n - 1;

        while(lo < hi){ 
            int mid = (lo + hi) / 2;

            if(arr[mid] < arr[mid + 1]){
                lo = mid + 1;   // go right (ascending part)
            } else {
                hi = mid;       // go left (descending part)
            }
        }

        System.out.println("Peak element: " + arr[lo]);

        sc.close();
    }
}