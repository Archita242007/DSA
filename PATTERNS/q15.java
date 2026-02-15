import java.util.Scanner;

public class q15 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a alphabet: ");
        char c= sc.next().charAt(0);
     for (char ch = 'A'; ch <= c; ch++) {
            for (char cc = 'A'; cc <= ch; cc++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
}
}