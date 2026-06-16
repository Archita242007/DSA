import java.util.Scanner;
class subarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums=new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for(int start=0;start<nums.length;start++)
        {
            for(int end=start;end<nums.length;end++){
          for(int i=start;i<=end;i++){
            System.out.print(nums[i]);
          }
            System.out.print(" ");
        }
        System.out.println();
    }}}
