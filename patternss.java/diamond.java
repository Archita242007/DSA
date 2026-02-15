import java.util.Scanner;
public class diamond {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        // upper triangle
        for(int i=n-1;i>=0;i--)
    {
      for(int k=0;k<=i;k++)
      {
        System.out.print(" ");
      }
     for(int j=n-1;j>=i;j--)
    {
      System.out.print("* ");
    }System.out.println();
    }
  // lower triangle
    for(int o=n-1;o>=1;o--)
    {
        for(int l=0;l<=n-o;l++)
        {
            System.out.print(" ");

        }
        for(int m=1;m<=o;m++)
        {
            System.out.print("* ");

        }System.out.println();
    }
sc.close();
}}