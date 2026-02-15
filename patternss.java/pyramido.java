import java.util.Scanner;
public class pyramido {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<(4-i-1);j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<(2*i+1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
sc.close();
  }  
}
