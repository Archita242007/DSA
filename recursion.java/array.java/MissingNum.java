import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
      System.out.println(num(nums));}
       public static int num(int nums[]){
       //int num-1=arr.length;  for indexing from 0
     //  int num= arr.length+1; // for indexing from 1

     //here we do indexing from 0 ( [0 to n] wala array ke liye solution)
       int i=0;
       while (i < nums.length) {

            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
    
        return nums.length;
    }
     public static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
       }
       
        }

