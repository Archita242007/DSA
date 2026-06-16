//ek array m largest number less than or equal to x find krke uska bhi last occurence dena h
import java.util.Scanner;

public class floor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter x: ");
        int x = sc.nextInt();

        int lo = 0, hi = n - 1, idx = -1;

        while(lo <= hi){
            int mid = (lo + hi) / 2;

            if(arr[mid] == x){
                idx = mid;
                lo = mid + 1;   // move right to find last occurrence
            }
            else if(arr[mid] < x){
                idx = mid;      // possible floor ,ye ho skta h agar aage nhi mila to
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }

        if(idx != -1){
            System.out.println("Floor value: " + idx);
        } else {
            System.out.println("No floor exists");
        }

        sc.close();
    }
}