// import java.util.Scanner;
// public class fibonnaci {
// public static void main(String args[])
// {
//     Scanner sc=new Scanner(System.in);
//     int i,f=0,s=1,c=0;
//     System.out.println("enter no.: ");
//     int n=sc.nextInt();
//    System.out.println(f);
//    System.out.println(s);
//     for(i=1;i<=n;i++)
//    { c=f+s;
//     f=s;
//     s=c;
//    System.out.println(c);
// }
// sc.close();
// }
// }
import java.util.*;


public class fibonnaci {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();


       while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       System.out.println("GCD is : "+ n2);
     sc.close();
}
}

