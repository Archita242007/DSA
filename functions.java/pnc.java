import java.util.*;
public class pnc {
    public static int fact(int n)
    {
int f=1;
for(int i=1;i<=n;i++)
{
    f=f*i;
}return f;}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int r=sc.nextInt();
    int c=0;
    c=fact(num)/(fact(r)*fact(num-r));
    int p=fact(num)/(fact(num-r));
    System.out.println(c);
    System.out.println(p);

sc.close();
} 
}
