import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        both(n);
    }
    static void nto1(int n){
        if(n==0){return ;}
       System.out.println(n);
       nto1(n-1);
    } 
    static void oneton(int n){
        if(n==0){return;}
        oneton(n-1);
        System.out.println(n);
    }
    static void both(int n){
        if(n==0){return;}
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
