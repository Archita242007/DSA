import java.util.Scanner;
public class merging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of 2 arrays: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[m];
        int brr[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            brr[j]=sc.nextInt();
        }
        int crr[]=new int[m+n];
        int i=0,j=0,k=0;
while(i<m&&j<n)
{
    if(arr[i]<brr[j])
    {
        crr[k++]=arr[i++];
       
    }
    else
    {
        crr[k++]=brr[j++];
        
    }}
    if(i==m){
        while(j<n){
            crr[k++]=brr[j++];
        }
    }
    else{
        while(i<m){
            crr[k++]=arr[i++];
        }
    }

for(int l=0;l<(m+n);l++){
System.out.print(crr[l]);}
sc.close();
}}
// add two arrays
// ulti trf se array banao
// teen array se ye kaam karo
// zero one wala program 0,1,2 ke liye kro
