import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {

        int arr[] = {3, 0, 1, 4, 2};

        Sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] Sort(int arr[]) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] == i) {
                i++;
            } else {

                int idx = arr[i];

                swap(arr, i, idx);
            }
        }

        return arr;
    }

    public static void swap(int arr[], int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}