
// count number of +ve no.s and -ve no.s return max of it using binary search
import java.util.Scanner;

public class maxno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lo = 0, hi = n - 1;

        // 🔍 Find first index where element >= 0
        int firstNonNeg = n;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] >= 0) {
                firstNonNeg = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        // 🔍 Find first index where element > 0
        lo = 0;
        hi = n - 1;
        int firstPos = n;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] > 0) {
                firstPos = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int nn = firstNonNeg; // number of negatives
        int pn = n - firstPos; // number of positives

        System.out.println(pn + " " + nn);
System.out.println(Math.max(nn, pn));
        sc.close();
    }
}