// import java.util.Scanner;
// public class segregate {

// public static void main(String args[])
// {
//     Scanner sc=new Scanner(System.in);
//     int  nofzero=0;
//      System.out.println("Enter number of elements: ");
//         int n=sc.nextInt();
//     int arr[]=new int[n];
//         System.out.print("enter elements: ");

//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//             if(arr[i]==0)
//             {
//                nofzero++;
//             }

//         }
//        for(int i=0;i<nofzero;i++)
//        {
//         arr[i]=0;
//        }
//        for(int j=nofzero;j<n;j++)
//        {
//         arr[j]=1;
//        }
//        for(int k=0;k<n;k++)
//      { System.out.print(arr[k]);}
//     sc.close();
// }
// }
import java.util.Scanner;

public class segregate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0,j=n-1;i<j;)
        {
            if(arr[i]==1&&arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
            else if(arr[i]==0)
            {
                i++;
            }
            else if(arr[j]==1)
                j--;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]);
        }
        sc.close();
    }
}