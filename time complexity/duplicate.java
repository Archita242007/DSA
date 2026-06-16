
import java.util.Scanner;
public class duplicate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements: ");
        int n=sc.nextInt();
        System.out.println("elements: ");
         int arr[]=new int[n];
        for(int i=0;i<n;i++)        
        {
            arr[i]=sc.nextInt();
        }
        boolean []flag=new boolean[n+1];
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if(flag[ele]==true){
                System.out.println("duplicate = "+ arr[i]);
            }else flag[ele]=true;
        }
        sc.close();

    }
}
