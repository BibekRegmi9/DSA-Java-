package array.twoDArray;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int[][] matrix2 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] ans = new int[3][3];

        // adding two matrix
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                ans[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

        // Print the result
        System.out.println("The resulting matrix after addition is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }


}
