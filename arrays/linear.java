import java.util.Scanner;

public class linear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter a number: ");
        int m = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (m == arr[i]) {
                found = true;
                break;   
            }
        }

        if (found)
            System.out.println("found");
        else
            System.out.println("not found");

        sc.close();
    }
}