package array.twoDArray;

public class MaxInRow {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {1, 2, 2},
                {1, 2, 1}
        };

        int sum = Integer.MIN_VALUE;

        for(int row = 0 ; row < matrix1.length; row++){
            int total = 0;
            for(int col = 0; col < matrix1[row].length; col++){
                total += matrix1[row][col];
            }

            if(total > sum){
                sum = total;
            }
        }
        System.out.println(sum);
    }
}
