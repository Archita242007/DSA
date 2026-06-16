
import java.util.Arrays;
import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
int target=sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0,j=arr.length-1;
        Arrays.sort(arr);
        while(i<j)
            {if(arr[i]+arr[j]==target){
System.out.println("pair: "+arr[i]+"+"+ arr[j]);i++;j--;
            }
            if(arr[i]+arr[j]>target)
            {                j--;
            } if(arr[i]+arr[j]<target)
            {
                i++;
            }}
            

        sc.close();
    }
}
