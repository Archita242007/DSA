import java.util.Scanner;
public class descend {
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
            System.out.println(mid);break;
         }  if(t>arr[mid]) {
            hi=mid-1;
         } if(t<arr[mid]) {
            lo=mid+1;}
}
sc.close();}}
// import java.util.Scanner;

// public class descend {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter no. of elements: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("enter elements (descending order): ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("enter target: ");
//         int t = sc.nextInt();

//         int lo = 0, hi = n - 1;
//         boolean found = false;

//         while(lo <= hi){ 
//             int mid = (lo + hi) / 2;

//             if(t == arr[mid]){
//                 System.out.println("Element found at index: " + mid);
//                 found = true;
//                 break;
//             }
//             else if(t > arr[mid]){
//                 hi = mid - 1;  // 🔥 move LEFT
//             }
//             else{
//                 lo = mid + 1;  // 🔥 move RIGHT
//             }
//         }

//         if(!found){
//             System.out.println("Element not found");
//         }

//         sc.close();
//     }
// }