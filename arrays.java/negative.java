import java.util.Scanner;
public class negative {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
       
       System.out.println("enter the number of elements: ");
       int n=sc.nextInt();
      
       int[] arr = new int[n];
 System.out.print("enter the elements: ");
       for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
        if(arr[i]<0)
        {
            System.out.print(arr[i]);
        }
       }

sc.close(); }
}
