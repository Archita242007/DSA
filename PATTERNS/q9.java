import java.util.Scanner;

public class q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = n-2; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
}}
