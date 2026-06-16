// import java.util.Scanner;
// import java.util.Arrays;

// public class alternate {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of elements in array:");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Step 1: Sort the array
//         Arrays.sort(arr);

//         int result[] = new int[n];

//         // Step 2: Two pointers
//         int left = 0;
//         int right = n - 1;

//         // Step 3: Rearrange
//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0) {
//                 result[i] = arr[right];
//                 right--;
//             } else {
//                 result[i] = arr[left];
//                 left++;
//             }
//         }

//         // Step 4: Print result
//         for (int i = 0; i < n; i++) {
//             System.out.print(result[i] + " ");
//         }

//         sc.close();
//     }
// }
// method 2(in same array)
import java.util.Scanner;
import java.util.Arrays;
public class alternate {

    public static void rearrange(int[] arr) {
     
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Choose a number greater than the maximum element
        int maxElement = arr[n - 1] + 1;

        // Step 3: Initialize pointers
        int maxIndex = n - 1;
        int minIndex = 0;

        // Step 4: Store both old and new values in array
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Place maximum element at even index
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                // Place minimum element at odd index
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        // Step 5: Extract the new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElement;
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int[] arr = {1, 82,893, 64, 567, 6};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
