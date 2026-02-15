import java.util.Scanner;

public class q19 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
         int space = 2*n-2;
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if (i > 4) {
                stars = 2*n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= stars; l++) {
                System.out.print("*");
            }
            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }
            System.out.println();
        }
        sc.close();
}
}