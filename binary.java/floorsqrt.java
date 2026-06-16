//ek no. denge agar uska sqrt h to return otherwise usse chote no.jo prfct sq h uska sqrt return kro
import java.util.Scanner;
public class floorsqrt {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       
//         int root=0;
//         for(int i=0;i<n;i++){
//             if((i*i)>n){
//                break;}  root=i;
            
//         }System.out.println(root);
//     }
// }
//time complexity=O(n^(1/2)) bcz loop itna hi run krpaega
   long lo=0,hi=n,root=0;
while(lo<=hi){
long mid=(lo+hi)/2;
if((mid*mid)==n)//(mid==n/mid)
 {  root=mid;
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
 System.out.println((int)root);

sc.close(); }}
// mid=lo+(hi-lo)/2