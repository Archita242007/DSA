import java.util.Scanner;
public class divisors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==i){
                System.out.println(i);
            }
            if((n/i)!=0){
                System.out.println((n/i));
            }
        }
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // }
        sc.close();
    }
}
