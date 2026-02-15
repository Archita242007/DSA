import java.util.Scanner;

public class q16 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a alphabet: ");
        char start = sc.next().charAt(0);

        System.out.print("Enter height: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = start;
            int br = (2 * i + 1) / 2;

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(ch);

                if (k < br) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }

        sc.close();
    }}