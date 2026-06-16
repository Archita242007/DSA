import java.util.Scanner;
public class butterfly {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no: ");
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for(int l=n-1;l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=0;i<=n-1;i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print("*");
            }
            for(int j=2*(i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(int l=n-1;l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
