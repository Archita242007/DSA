public class sumofNaturalno {
    public static void printSum(int i,int n,int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }sum+=i;
        printSum(i+1, n, sum);
    }public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
// public class SumOfNaturalNo {

//     static int printSum(int n) {
//         if (n == 1)
//             return 1;

//         return n + printSum(n - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(printSum(5));
//     }
// }