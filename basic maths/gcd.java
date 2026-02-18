import java.util.Scanner;
public class gcd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=Math.min(n1, n2); i>=1;i--){
            if(n1%i==0&&n2%i==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
