import java.util.Scanner;

public class q17 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ending alphabet: ");
        char end = sc.next().charAt(0); 

        int n = end - 'A' + 1;

        for (int i = 0; i < n; i++) {
           
            char ch = (char) (end - i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; 
            }
            System.out.println();
        }

        sc.close();
    }
}
