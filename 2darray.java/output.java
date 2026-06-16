import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };

        int brr[][] = new int[3][6]; // FIXED SIZE

        System.out.println(arr.length + " " + arr[0].length);

        // input for brr
        for(int i = 0; i < brr.length; i++) {
            for(int j = 0; j < brr[0].length; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        // print arr
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // print brr (FIXED)
        for(int k = 0; k < brr.length; k++) {
            for(int l = 0; l < brr[0].length; l++) {
                System.out.print(brr[k][l] + " ");
            }
            System.out.println();
        }sc.close();
    }
}