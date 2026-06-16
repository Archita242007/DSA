import java.util.Scanner;

public class search2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // target
        int m = sc.nextInt();   // rows
        int n = sc.nextInt();   // cols

        int a[][] = new int[m][n];

        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int rows = m, col = n;
        int lo = 0, hi = rows * col - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int midrow = mid / col;
            int midcol = mid % col;

            if (a[midrow][midcol] == t) {
                System.out.println("Found at: " + midrow + ", " + midcol);
                return;
            }

            if (a[midrow][midcol] > t) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println("Not Found");sc.close();
    }
}