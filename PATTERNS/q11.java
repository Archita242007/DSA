import java.util.Scanner;

public class q11 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
           int c= 2*n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <c; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            c -= 2;
            System.out.println();
        }
        sc.close();
}}
