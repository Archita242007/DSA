import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };
        int max=0;
          for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
    }
}System.out.println(max);
    }}