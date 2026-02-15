import java.util.Scanner;
public class minecraft
{
 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
for(int i=1;i<=10;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if((i==1&&j>0&&j<=5)||(i==4&&j>0&&j<=5)||(j==1&&i>0&&i<=4)||(j==5&&i>0&&i<=4)
            ||(j==3&&i>4&&i<9)||(i==6&&j==2)||(i==6&&j==4)||(i==7&&j==1)||(i==7&&j==5)||
            (i==8&&(j==2||j==4))||(i==9&&(j==1||j==5)))
            System.out.print("* ");
            else
            System.out.print("  ");
        }System.out.println( );
    }
    
    sc.close();
   }
}
