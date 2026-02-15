import java.util.Scanner;

public class q18 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
     int inisp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < inisp; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= n- i; l++) {
                System.out.print("*");

            }
            inisp += 2;
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = inisp - 2; k > 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            inisp -= 2;
            System.out.println();
        }
        sc.close();
}
}