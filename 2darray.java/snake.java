import java.util.*;
public class snake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };
        // for(int i=0;i<arr.length;i++){
        //     if(i%2==0){
        //         for(int j=0;j<arr[0].length;j++){
        //             System.out.print(arr[i][j]+" ");
        //         }}
        //         else{
        //             for(int j=arr[0].length-1;j>0;j--){
        //                 System.out.print(arr[i][j]+" ");
        //             }
        //         }System.out.println();
        //     }
         int c = 0;

while (c < arr[0].length) {

    if (c % 2 == 0) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][c] + " ");
        }
    } 
    else {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i][c] + " ");
        }
    }
    // System.out.println();

    c++;
}}}