import java.util.Scanner;

public class r1 {
    public static void printNumb(int n){
        if(n==0) return;
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        printNumb(n);
        sc.close();
    }
}
