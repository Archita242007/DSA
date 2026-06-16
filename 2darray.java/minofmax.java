public class minofmax {
    public static void main(String args[]) {

        int arr[][] = {
            {2,54,35,3,4,6},
            {4,5,6,7,44,34},
            {57,57,87,6,6,54}
        };

        int minOfMax = Integer.MAX_VALUE; // final answer

        for(int i = 0; i < arr.length; i++) {

            int max = Integer.MIN_VALUE; // reset for each row

            for(int j = 0; j < arr[0].length; j++) {
                max = Math.max(max, arr[i][j]);
            }

            minOfMax = Math.min(minOfMax, max); // 🔥 key step
        }

        System.out.println(minOfMax);
    }
}
