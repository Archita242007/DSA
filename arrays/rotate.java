import java.util.Scanner;

public class rotate {
   static void reverse(int arr1[],int i,int j)
   {
int temp=0;
        while(i<j)
        {
            temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++;
            j--;
        }
   } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the steps: ");
        int d = sc.nextInt();
           d=d%n;
        reverse(arr, 0, n-1);
        reverse(arr, d,n-1);
        reverse(arr, 0, d-1);
for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
