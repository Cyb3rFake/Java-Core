package Arrays.Practice;

public class Matrix_24_2 {
    public static void main(String args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        //output the numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
