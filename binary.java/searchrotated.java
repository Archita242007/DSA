import java.util.Scanner;

public class searchrotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
int t=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lo = 0, hi = n - 1;
        // int pivot = -1;

        // while (lo <= hi) {
        //     int mid = (lo + hi) / 2;

        //     // Case 1: pivot found
        //     if (mid < hi && arr[mid] > arr[mid + 1]) {
        //         pivot = mid;
        //         break;
        //     }

        //     // Case 2: pivot found
        //     if (mid > lo && arr[mid] < arr[mid - 1]) {
        //         pivot = mid - 1;
        //         break;
        //     }

        //     // Case 3: left side sorted → pivot in right
        //     if (arr[lo] <= arr[mid]) {
        //         lo = mid + 1;
        //     }
        //     // Case 4: right side sorted → pivot in left
        //     else {
        //         hi = mid - 1;
        //     }
        // }
        // if (pivot != -1) {
        //     System.out.println("Pivot element: " + arr[pivot]);
        // } 
        // int h=n-1,l=pivot+1;
        // while(l<=h){
        //     int m=(l+h)/2;
        //     if(t==arr[m]){
        //         System.out.println(arr[m]+" "+m);
        //         break;
        //     }
        //     else if(t>arr[m]) l=m+1;
        //     else h=m-1;}
        //     int hg=pivot-1,low=0;
        //      while(low<=hg){
        //     int mi=(low+hg)/2;
        //     if(t==arr[mi]){
        //         System.out.println(arr[mi]+" "+mi);
        //         break;
        //     }
        //     else if(t>arr[mi]) low=mi+1;
        //     else hg=mi-1;
        // }

    while (lo <= hi) {
        int mid = (lo + hi) / 2;
if(t==arr[mid]) {System.out.println(mid); break;}
else if(arr[lo]<arr[mid]){
    if(arr[lo]<=t &&t<arr[mid])hi=mid-1;
    else lo=mid+1;
}
else  if(arr[mid]<arr[hi]){
    if(arr[mid]<=t && t<=arr[hi])lo=mid+1;
    else hi=mid-1;
}
else 
    {System.out.println(-1);
 break;}

    }
sc.close();}}
