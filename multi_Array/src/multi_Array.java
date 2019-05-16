import java.util.Arrays;

class multi_Array {
    public static void main(String[] args) {
        int[][] A = {{1,1,0}, {1,0,1}, {0,0,0}};
        int rows = A.length;
        int cols = A[0].length;
        System.out.println(Arrays.toString(A[0]));

        for (int i=0; i<rows; i++) {
            int j = 0;
            int k = cols-1;

            while(j <= k) {
                int temp = A[i][j];
                A[i][j] = A[i][k]^1;
                System.out.println(0^1);
                A[i][k] = temp^1;

                j++;
                k--;
            }
        }
        for (int m=0; m<=cols-1; m++) {
            for (int n=0; n<=cols-1; n++){
               System.out.print(A[m][n]);
            }
            System.out.println();
        }
    }
}