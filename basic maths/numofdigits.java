import java.util.Scanner;
public class numofdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int c=0;
        while(n>0){
             n=n/10;
        c=c+1;
        }
        System.out.println(c);
        sc.close();
    }
}