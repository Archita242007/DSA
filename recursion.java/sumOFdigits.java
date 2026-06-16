import java.util.Scanner;

public class sumOFdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0)return 0;
        int num=n;
       int rem=num%10;
       num/=10;
       return rem + sum(num);
    }
}
