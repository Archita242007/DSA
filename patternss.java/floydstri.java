import java.util.Scanner;
public class floydstri {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
           {c++;
            System.out.print(c+" ");
        }System.out.println();
    }sc.close();
}}
