import java.util.*;
public class circular{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int currMax = arr[0];
int maxSum = arr[0];

for(int i = 1; i < arr.length; i++) {

    // either continue old bad subarray
    // or start new bad subarray
    currMax = Math.max(arr[i], currMax + arr[i]);

    // store overall minimum
    maxSum = Math.max(maxSum, currMax);
}        if(maxSum < 0) {
            System.out.println(maxSum);
            return;
        }

    int currMin = arr[0];
int minSum = arr[0];

for(int i = 1; i < arr.length; i++) {

    // either continue old bad subarray
    // or start new bad subarray
    currMin = Math.min(arr[i], currMin + arr[i]);

    // store overall minimum
    minSum = Math.min(minSum, currMin);
}
    // System.out.println(maxSum+" "+minSum);
    int cSum=0,ts=0;
    for(int j=0;j<arr.length;j++){
        ts=ts+arr[j];
    }
        cSum = ts- minSum;
System.out.println(Math.max(cSum,maxSum));
}}