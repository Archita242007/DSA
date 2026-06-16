class Solution {
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            for (int i = arr.length - 1; i >= 0; i--)
                System.out.print(arr[k][i] + " ");
            System.out.println();
        }
    }
}