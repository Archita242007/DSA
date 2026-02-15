import java.util.Scanner;

public class missing {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n=arr.length+1;     //number should be from 1 to n+1
        long s = ((n) * (n + 1)) / 2;

        long sum = 0;
        for (int ele: arr) {
            sum = sum + ele;
        }

        long miss = s - sum;
        System.out.println(miss);

        sc.close();
    }
}
