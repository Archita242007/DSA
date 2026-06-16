import java.util.Scanner;

public class binarysearch{
public static void main (String args[]) { 
    Scanner sc=new Scanner(System.in);
    
    int key=88;
    int nums[]={1,2,5,7,55,76,88};
System.out.println( binarySearch(nums, key, 0, nums.length - 1));
    }

    private static int binarySearch(int[] nums, int key, int low, int high) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (nums[mid] == key)
            return mid;

        if (key < nums[mid])
            return binarySearch(nums, key, low, mid - 1);

        return binarySearch(nums, key, mid + 1, high);
    } 
    
}
