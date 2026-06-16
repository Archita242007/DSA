// method 1
// import java.util.ArrayList;

// public class AllIndexes {

//     static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {

//         if (index == arr.length) {
//             return list;
//         }

//         if (arr[index] == target) {
//             list.add(index);
//         }

//         return findAllIndexes(arr, target, index + 1, list);
//     }

//     public static void main(String[] args) {

//         int[] arr = {1, 4, 3, 4, 5, 4, 7};
//         int target = 4;

//         ArrayList<Integer> result = findAllIndexes(arr, target, 0, new ArrayList<>());

//         System.out.println(result);
//     }
// }

//method 2
import java.util.ArrayList;

public class AllIndexes {

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =
                findAllIndexes(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 4, 5, 4, 7};

        System.out.println(findAllIndexes(arr, 4, 0));
    }
}



//addAll function  - add all the elements from one list into another

// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {

//         ArrayList<Integer> list1 = new ArrayList<>();
//         list1.add(1);
//         list1.add(3);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(5);
//         list2.add(7);

//         list1.addAll(list2);

//         System.out.println(list1);
//     }
//}