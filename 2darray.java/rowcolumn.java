import java.util.Scanner;

public class rowcolumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
                { 2, 54, 35, 3, 4, 6 },
                { 4, 5, 6, 7, 44, 34 },
                { 57, 57, 87, 6, 6, 54 }
        };
//         for(int i=0;i<arr.length;i++)
// {
//     System.out.print(arr[i][0]+ " ");
// }   System.out.println();
// for(int j=0;j<arr[0].length;j++){
//     System.out.print(arr[0][j]+ " ");
// }System.out.println();
// for(int j=0;j<arr[0].length;j++){
//     System.out.print(arr[1][j]+ " ");
// }System.out.println();
// for(int j=0;j<arr[0].length;j++){
//     System.out.print(arr[2][j]+ " ");
// }System.out.println();
for(int[] ele: arr){
    for(int a: ele){
        System.out.print(a+" ");
    }System.out.println();
}
 }
}
