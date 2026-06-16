  import java.util.*;
public class pascal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//         int n = 5;

//         ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

//         for (int i = 0; i < n; i++) {

//             ArrayList<Integer> row = new ArrayList<>();

//             for (int j = 0; j <= i; j++) {

//                 if (j == 0 || j == i) {
//                     row.add(1);
//                 } else {
//                     int value = triangle.get(i - 1).get(j - 1)
//                               + triangle.get(i - 1).get(j);

//                     row.add(value);
//                 }
//             }

//             triangle.add(row);
//         }

//         // Printing
//         for (ArrayList<Integer> row : triangle) {
//             for (int num : row) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }
//     }
// }






        int n = 5;

        int[][] arr = new int[n][n];

        // Storing values
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        // Printing
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
