import java.util.Scanner;
public class ksmallest {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter k: ");
        int k=sc.nextInt();
        for(int i = 0; i < k; i++) {
            int min = arr[i];
            int mindx = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        System.out.println(arr[k-1]);
    sc.close();
   } 
}
