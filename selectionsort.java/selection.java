import java.util.Scanner;

public class selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for(int i = 0; i < n; i++) {
            int min = arr[i];
            int mindx = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}