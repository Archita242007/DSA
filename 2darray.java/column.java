import java.util.Scanner;
public class column {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        
        int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };int[][] transpose = new int[6][3];
        for(int i=0;i<3;i++)
        {
            for( int j=0;j<6;j++){
                 transpose[j][i] = arr[i][j];
            }
        }
         for(int i=0;i<6;i++)
        {
            for( int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
    }System.out.println();
}
    }}