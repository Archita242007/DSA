public class linearSearch {

    public static void main(String[] args) {

        int target = 4;
        int arr[] = {1, 26, 43, 7, 54, 4, 5};

        int result = search(arr, target, 0);

        System.out.println(result);
    }

    static int search(int arr[], int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return search(arr, target, index + 1);
    }
}