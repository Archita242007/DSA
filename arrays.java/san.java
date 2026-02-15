// import java.util.*;
// public class san {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Vector<Integer>ans=new Vector<>();
//         int A[] = { 9, 8};
//         int B[] = {9, 8};
//         int n = A.length;
//         int m = B.length;
//         int k = Math.max(n,m) - 1;
//         int g = Math.min(n,m) - 1;
//         int carry = 0;
//         int finalvalue = 0;
//         int zo = 0;
//         for(int i = 0, z = 0; i <= k; i++, z++){
//             int dA = A[k - z];
//             int dB = 0;
//             try {
//                 dB = B[g - z];
//             } catch (Exception e) {
//                 dB = 0;
//             }
//             int sum = dA + dB + carry;
//             // System.out.print(sum % 10);
//             finalvalue += sum%10 * Math.pow(sum, zo++);
//             carry = sum / 10;
//         }
//         if(carry == 1){
//             finalvalue += 1 * zo; 
//         }
//         //   if(carry==1)
//         // {
//         //     ans.add(1);}
//         // Collections.reverse(ans);
//         System.out.println(ans);
//     }
// }
import java.util.*;
class san {

//    String calc_Sum()
   public static void main(String[] args) {
        // Complete the function
         Vector<Integer>ans=new Vector<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int k = Math.max(n,m) - 1;
        int g = Math.min(n,m) - 1;
        int carry = 0;
        int finalvalue = 0, zo = 0;
        for(int i = 0, z = 0; i <= k; i++, z++){
            int dA = arr1[k - z];
            int dB = 0;
            try {
                dB = arr2[g - z];
            } catch (Exception e) {
                dB = 0;
            }
            int sum = dA + dB + carry;
            // int d=sum %10;
            Collections.reverse(ans);
            System.out.print(ans);
            finalvalue += sum%10 * Math.pow(sum, zo++);
            carry = sum / 10;
        }
        if(carry == 1){
            finalvalue += 1 * zo; 
        }
        // String ans = Integer.toString(finalvalue);
        // return ans;
        sc.close();
            }}
//     public static void main(String[] args) {
//         san a = new san();
//         String abc = a.calc_Sum();
//         System.out.println(abc);
//     }
// }