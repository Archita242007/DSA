
    import java.util.Scanner;
public class arrangingcoins {
  public static int sqrt(int n){
         long lo=0,hi=n,root=0;
while(lo<=hi){
long mid=(lo+hi)/2;
if((mid*mid)==n)//(mid==n/mid)
 {  root=(int)mid;
break;
}
else if((mid*mid)>n)//(mid>n/mid)
   {
    hi=mid-1;
}
 else { lo=mid+1;
    root=mid;
 }
}
return (int)root;
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

System.out.println((sqrt(8*n+1)-1)/2);



sc.close();
  }  
}
