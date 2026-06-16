import java.util.Scanner;
public class bubble {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        //brute force
        // for(int i=1;i<=n-1;i++){
        //     for(int j=0;j<=n-2;j++){
        //  if(arr[j]>arr[j+1]){
        //    int temp=arr[j];
        //    arr[j]=arr[j+1];
        //    arr[j+1]=temp;
        //  }
        //     }
        // }for(int i=0;i<n;i++){
        //System.out.println(arr[i]);}
        //better approach
         for(int i=0;i<n-1;i++){
            boolean issorted=true;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    issorted=false;break;
                }}
                if(issorted==true) break;
                for(int j=0;j<n-1-i;j++){
                    if(arr[j]>arr[j+1]){
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                    }
                }
            }for(int i=0;i<n;i++){
        System.out.println(arr[i]);}
         
        sc.close();
    }

}