package JustCode.Medium;

public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length==0 || mat[0].length==0) return new int[]{};

        int m = mat.length, n = mat[0].length;
        int[] solArr = new int[m*n];
        int index = 0;

        int row = 0, col = 0;
        boolean up = true;

        while(row < m && col < n){
            //for up
            if(up){
                while(row > 0 && col < n-1){
                    solArr[index++] = mat[row--][col++];
//                    row--;
//                    col++;
                }
                solArr[index++] = mat[row][col];
                if(col == n-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            //for down
            else{
                while(row < m-1 && col > 0){
                    solArr[index++] = mat[row++][col--];
//                    row++;
//                    col--;
                }
                solArr[index++] = mat[row][col];
                if(row == m-1){
                    col++;
                }
                else{
                    row++;
                }
            }
            up = !up;
        }
        return solArr;
    }

    // Another better solution (on the lines that i was thinking)

    /*

    int N = mat.length, M = mat[0].length, k = 0;
        int[] res = new int[N*M];

        for (int d = 0; d < N + M - 1; d++) {

            int row, col;
            if (d % 2 == 0) {
                if (d < N) {
                    row = d;
                    col = 0;
                } else {
                    row = N - 1;
                    col = d - N + 1;
                }
                while (row >= 0 && col < M) {
                    res[k++] = mat[row--][col++];
                }
            } else {
                if (d < M) {
                    row = 0;
                    col = d;
                } else {
                    row = d - M + 1;
                    col = M - 1;
                }
                while (row < N && col >= 0) {
                    res[k++] = mat[row++][col--];
                }
            }
        }

        return res;

     */

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        FindDiagonalOrder f = new FindDiagonalOrder();
        int[] arr = f.findDiagonalOrder(a);
        for(int i = 0; i < arr.length; i++){
                System.out.print((arr[i]) + " ");
            }

    }
}
