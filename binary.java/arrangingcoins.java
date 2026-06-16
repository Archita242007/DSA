//ek number denge utne coins ko staircase jese lagana h or output m wo aega jitna no. of complete rows h
// staircase->
// *
// **
// *** public static arrangeCoins(int n) {
// ****
import java.util.Scanner;
public class arrangingcoins {
//   public static int sqrt(int n){
//          long lo=0,hi=n,root=0;
// while(lo<=hi){
// long mid=(lo+hi)/2;
// if((mid*mid)==n)//(mid==n/mid)
//  {  root=(int)mid;
// //break;
// }
// else if((mid*mid)>n)//(mid>n/mid)
//    {
//     hi=mid-1;
// }
//  else { lo=mid+1;
//     root=mid;
//  }
// }
// return (int)root;
// }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

// System.out.println((sqrt(8*n+1)-1)/2);

long lo =0,hi=n,ans=0;
while(lo<=hi){
  long k=lo+(hi-lo)/2;
  long m= k*(k+1)/2;
  if(m==n)System.out.println((int)k);
  else if(m>n){hi=k-1;}
  else {
    ans=k;lo=k+1;
  }
  }System.out.println((int)(ans));


sc.close();
  }  
}
