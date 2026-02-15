import java.util.Scanner;
public class archita {
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
for(int i=0;i<=10;i++)
{
   for(int j=0;j<=50;j++)
   {
      if(((i==0&&j!=0&&j<5)     //FOR A
      ||(j==0&&i>0)
      ||(j == 5 && i != 0)
      ||(i==5&&j!=0&&j<5) )||
      ((j==8&&i>0)             //FOR R
      ||(j == 13&& i!=0&&i<5)
      ||(i==0&&j>=8&&j<13)||       
      (i==5&&j>=8&&j<13)
      ||(j==13&&i>5))||
      ((i==0&&j>16&&j<=21)||(i>0&&i<=9&&j==16)||(i==10&&j>16&&j<=21)    //FOR C
      )
      ||((j==24&&i>=0)||(i==5&&j>23&&j<=27)||(j==28&&i>=0))||           //for H
      (i==0&&j>=31&&j<36)||(j==33&&i>0&&i<10)||(i==10&&j>=31&&j<36)||     //for I
      ((i==0&&j>=38&&j<=42)||(i>0&&j==40))      //for T
      ||((i==0&&j>45&&j<50)     //FOR A
      ||(j==45&&i>0)
      ||(j ==50&& i>0)
      ||(i==5&&j>45&&j<50) )
      )
      {
         System.out.print("*");
      }
      
      else
      {
         System.out.print(" ");
      }}
      System.out.println();
      
}


   sc.close();
}
}


