import java.util.Scanner;
public class rowmaxsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };int s=0,c=0;int r=-1;
          for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
s=s+arr[i][j];
}
if(s>c)
   { c=s;
    r=i;}
s=0;

}System.out.println(c);
System.out.println(r);
    }}
//     public class rowmaxsum {
//     public static void main(String[] args) {

//         int arr[][] = {
//             {2,54,35,3,4,6},
//             {4,5,6,7,44,34},
//             {57,57,87,6,6,54}
//         };

//         int c = Integer.MIN_VALUE; // max sum

//         for(int i = 0; i < arr.length; i++) {
//             int s = 0; // reset per row

//             for(int j = 0; j < arr[0].length; j++) {
//                 s += arr[i][j];
//             }

//             c = Math.max(c, s); // 🔥 key line
//         }

//         System.out.println(c);
//     }
// }