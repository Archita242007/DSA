import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)        
        {
            arr[i]=sc.nextInt();
        }
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            brr[i]=sc.nextInt();
        }
         Vector<Integer> ans=new Vector<>();
        int i=m-1,j=n-1; int carry=0;
        int k=Math.max(i, j);
        for( i=m-1,j=n-1;i<=k;i--,j--){
           if(arr[i]+brr[j]+carry<=9) {
                 ans.add(arr[i]+brr[j]+carry);
            }
            else{
                ans.add(0);
                carry=1;
            }}
        if(carry==1)
        {
            ans.add(1);}
            Collections.reverse(ans);
        
        System.out.println(ans);



        sc.close();
    }}

