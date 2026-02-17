import java.util.Scanner;
public class reverse {
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int n=sc.nextInt();
    int num=n;int r=0;int q;
    while(num>0){
        q=num%10;
        r=10*r +q;
        num/=10;
    }
    System.out.println(r);
    sc.close();
  }  
}
