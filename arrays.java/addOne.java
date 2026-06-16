import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class addOne {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//inputing length
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();//input elements
        }
        Vector<Integer> ans=new Vector<>();//arraylist
        int carry=1;
        for(int i=n-1;i>=0;i--)
        {
          if(arr[i]+carry<=9)
{
ans.add(arr[i]+carry);
carry=0;
}
else{
    ans.add(0);
carry=1;
}
        }
        if(carry==1)
        {
            ans.add(1);}
            Collections.reverse(ans);
        
        System.out.println(ans);
        sc.close();
    }
}
