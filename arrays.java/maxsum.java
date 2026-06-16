import java.util.Scanner;
public class maxsum {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums=new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();}
        int maxsum=0,cs=0;
        for(int start=0;start<nums.length;start++)
        {cs=0;
            for(int end=start;end<nums.length;end++){
            cs=cs+nums[end];
            maxsum=Math.max(maxsum, cs);
              }  }System.out.println(maxsum);
}
    }
//     class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxs=nums[0],s=0;
//         for(int start=0;start<nums.length;start++)
// { 
//         s=s+nums[start];
//      maxs=Math.max(s,maxs);

//             if (s < 0) {
//                 s = 0;
//             }
// }   
// return maxs; }
// }