
import java.util.Scanner;
public class numofdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        double n=sc.nextDouble();
        // while(n>0){
        //      n=n/10;
        //  c=c+1;
n = Math.abs(n);
int count = (int)(Math.log10(n) + 1);
System.out.println("Number of digits: " + count);
        sc.close();
    }
}