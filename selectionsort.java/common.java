//METHOD 1




// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Vector;

// public class common {
//     public static void main(String[] args) {
//         Vector<Integer> ans = new Vector<>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no. of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("enter no. of elements: ");
//         int m = sc.nextInt();
//         int arr1[] = new int[m];
//         boolean[] used = new boolean[arr1.length];// track used elements
//         // {F,F,F,F,F,F,.....ARR1.LENGTH}
//         System.out.println("enter elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("enter elements: ");
//         for (int i = 0; i < m; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         Arrays.sort(arr1);
//         for (int i = 0; i < n; i++) {//i=0 i=1
//             for (int j = 0; j < m; j++) {//j=0,1,2,3,4,......

//                 if (arr[i] == arr1[j] && !used[j]) {//4!=5, not used ;4!=5, not used ;4!=5, not used ;4==4 ,not used

//                     ans.add(arr1[j]);//ans=[4,]
//                     used[j] = true;// mark as used {F,F,F,T,F,F......}
//                     break;// move to next arr element
//                 }
//             }
//         }
//         System.out.println(ans);
//         sc.close();
//     }
// }




//METHOD 2: do by 2 pointer method




import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class common {
    public static void main(String[] args) {
        Vector<Integer> ans = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no. of elements: ");
        int m = sc.nextInt();
    int arr1[] = new int[m];
    System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter elements: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i = 0,j=0;
      while(i<n&& j<m){
if(arr[i]==arr1[j]){
ans.add(arr[i]);
i++;j++;
}

  else  if(arr[i]>arr1[j])
    {
        j++;
    }
    else 
    {    i++;
}}
      System.out.println(ans);
sc.close();
        }}
        





