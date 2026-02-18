import java.util.Scanner;
public class euclidean{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //gcd(n1,n2)=gcd(n1-n2,n2)
        //gcd(20,15)=gcd(5,15)
        //gcd(15,5)=gcd(10,5)
        //gcd(10,5)=gcd(5,5)=gcd(0,5)
        while(a>0&&b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        if(a==0){
System.out.println(b);
        }else System.out.println(a);
        sc.close();
    }
}