import java.util.Scanner;
class sumk{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
  System.out.println("enter k: ");
  int k=sc.nextInt();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums=new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int c=0,s=0;
        for(int start=0;start<nums.length;start++)
        {s=0;
            for(int end=start;end<nums.length;end++){
             s=s+nums[end];
                if(s==k){
                    c=c+1;
                }}
            }
            
            
        System.out.println(c);
    }}
