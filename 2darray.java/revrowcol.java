import java.util.Scanner;
public class revrowcol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
