
import java.util.Scanner;
public class wave {
      
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of elements in array:  ");
    int n=sc.nextInt();
    int arr[]= new int[n];
    System.out.println("enter elements: ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int j=0;j<n;j+=2)
{
    if(j==arr.length-1){
        break;
    }
int temp=0;
       
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
   } 
    for(int k=0;k<n;k++)
    {
    System.out.print(arr[k]);
    }
    sc.close();
}}

