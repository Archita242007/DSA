import java.util.Scanner;
public class kthmissing {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
  for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//1,2,4,7,8,9,10
        }
        System.out.println("enter k: ");
        int k=sc.nextInt();//5
        int lo=0,hi=n-1;//0,6
        while(lo<=hi){ 
           int mid=(lo+hi)/2;//3 //5
           int correctno=mid+1;//4 //6
           int missing=arr[mid]-correctno;//7-4=3 //10-6=4
           if(missing>=k) hi=mid-1;
           else lo=mid+1;//4 //11
    }System.out.println(hi+1+k);//6+1+5=12
    sc.close();
}}
