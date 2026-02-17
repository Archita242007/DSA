import java.util.Scanner;
public class armstrong {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        double ld,sum=0,c=0;int num=n;
        while (num>0)
        {
            num=num/10;
            c=c+1;
        }
        int no=n;
        while(no>0)
        {
            ld=no%10;
            sum=sum + Math.pow(ld,c);
            no/=10;
        }
        System.out.println(sum);
        System.out.println(c);
        int s=(int)sum;
        if(s==n){
            System.out.println("armstrong number");
        }else System.out.println("not armstrong number");
            sc.close();
    }
}
