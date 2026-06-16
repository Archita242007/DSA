// import java.util.Scanner;
// import java.util.Vector;
// public class union {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Vector <Integer> ans=new Vector<>();
        
//         System.out.println("enter no. of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("enter no. of elements: ");
//         int m = sc.nextInt();
//     int arr1[] = new int[m];
//     //boolean used[]=new boolean [m];
//     System.out.println("enter elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("enter elements: ");
//         for (int i = 0; i < m; i++) {
//             arr1[i] = sc.nextInt();
//         }
//        // int i=0,j=0;
//        for(int i=0;i<n;i++)
//             {
//                 for(int j=0;j<m;j++){
//                     if(arr[i]==arr[j]){
//                         ans.add(arr[i]);
//                     }
//                     if(arr[i]!=arr[j]){
//                         ans.add(arr[i]);
//                         ans.add(arr1[j]);
//                     }
                
//             }
//         }
//         System.out.println(ans);
//         sc.close();
//     }
// }
import java.util.*;

public class union {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Vector<Integer> ans = new Vector<>();

        // Step 1: Process arr1
        for(int i = 0; i < n; i++) {
            boolean found = false;

            for(int j = 0; j < ans.size(); j++) {
                if(ans.get(j) == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                ans.add(arr1[i]);
            }
        }

        // Step 2: Process arr2
        for(int i = 0; i < m; i++) {
            boolean found = false;

            for(int j = 0; j < ans.size(); j++) {
                if(ans.get(j) == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                ans.add(arr2[i]);
            }
        }

        System.out.println("Union: " + ans);
        sc.close();
    }
}