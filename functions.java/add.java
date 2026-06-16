
import java.util.*;
public class add {
static int sum(int x,int y)
 {
    return x+y;
   }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int s=sum(a,b);
      System.out.println(s);
    
    sc.close();
}}