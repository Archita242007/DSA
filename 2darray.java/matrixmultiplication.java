import java.util.*;

public class matrixmultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // rows and columns of first matrix
        int m = sc.nextInt();
        int n = sc.nextInt();

        // rows and columns of second matrix
        int l = sc.nextInt();
        int p = sc.nextInt();

        // multiplication possible only if n == l
        if (n != l) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int arr1[][] = new int[m][n];
        int arr2[][] = new int[l][p];
        int product[][] = new int[m][p];

        // input first matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // input second matrix
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {

                product[i][j] = 0;

                for (int k = 0; k < n; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // print product matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}