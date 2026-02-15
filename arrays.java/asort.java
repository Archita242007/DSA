import java.util.Scanner;
import java.util.Arrays; //java.util.Arrays is a utility class that provides many static
//  methods to work with arrays (sorting, searching, comparing, filling, etc.).

public class asort {
    public static void main(String args[])
    {
         Scanner sc =new Scanner(System.in);
           System.out.println("enter the number of elements: ");
       int n=sc.nextInt();
       int[] arr = new int[n];
 System.out.print("enter the elements: ");
        for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
    //    Arrays.sort(arr); //Sorts an array in ascending order.
    System.out.println(Arrays.toString(arr)); //Converts array into a readable string.

    //    for(int i=0;i<n;i++)
    //    {
    //    System.out.println(arr[i]);}
       sc.close();
    }
}
