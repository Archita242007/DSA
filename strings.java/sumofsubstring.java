import java.util.Scanner;

public class sumofsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String s="123";int sm=0;
     for(int i=0;i<s.length();i++){
        int sum=0;
      for(int j=i+1;j<=s.length();j++){
        int n=Integer.parseInt((s.substring(i,j)));
                sum=sum+n;
      }
     sm=sm+sum;
      }
      System.out.println(sm);
    }
}
