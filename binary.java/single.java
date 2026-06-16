
//find a elemnt occuring single time ina array with others appearing twice
// brute force
import java.util.Scanner;

public class single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int c = 0;
        // for (int i = 0; i < n; i++) {
        //     c = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] ==arr[ i]) {
        //             c++;
        //         }
            
        //     }
        //     if (c == 1) {
        //             System.out.print(arr[i]+" ");
        //         }
        // }

//better

        int lo = 0, hi = n - 1;

        while(lo < hi){
            int mid = (lo + hi) / 2;

            // make mid even
        //     if(mid % 2 == 1){
        //         mid--;
        //     }

        //     if(arr[mid] == arr[mid + 1]){
        //         lo = mid + 2;   // correct pair, go right
        //     } else {
        //         hi = mid;       // broken pair, go left
        //     }
        // }

        // System.out.println(arr[lo]);


        //better
        if(arr.length==1){
            System.out.println(arr[0]);break;
        }
        if(arr[mid]==arr[mid-1]||arr[mid]==arr[mid+1]){
            
        if(arr[mid-1]==arr[mid]){
            int p=mid-1;
            int d=mid;
            if((p-1-lo+1)%2!=0){
            hi=p-1;
            }else{ lo=d+1;}}
        else if(arr[mid+1]==arr[mid]){
            int p=mid;
            int d=mid+1;
        if((p-lo)%2!=0){
             hi=p-1;
            }else{ lo=d+1;}
        }}
    //  if (mid == 0) {
    //     if (arr[mid] != arr[mid + 1]) {
    //         System.out.println("single: " + arr[mid]);
    //         break;
    //     } else {
    //         lo = mid + 2;
    //         continue;
    //     }
    // }

    if (mid == n - 1) {
        if (arr[mid] != arr[mid - 1]) {
            System.out.println("single: " + arr[mid]);
            break;
        } else {
            hi = mid - 2;
            continue;
        }
    }

    if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
        System.out.println("single: " + arr[mid]);
        break;
    }
        }
        sc.close();
    
}
}