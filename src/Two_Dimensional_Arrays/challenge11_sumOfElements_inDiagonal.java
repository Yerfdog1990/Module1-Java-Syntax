package Two_Dimensional_Arrays;
//In a 2D matrix of NxN (Square), find teh sum of all the numbers
//on the left and right diagonal
public class challenge11_sumOfElements_inDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 5, 7},
                {1, 0, 9},
                {6, 8, 2}
        };
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumLeftDiagonal += matrix[i][i];
            sumRightDiagonal += matrix[i][matrix.length -1 - i];
        }
        System.out.println("Sum of element to the left of diagonal: " +sumLeftDiagonal);
        System.out.println("Sum of element to the right of diagonal: " +sumRightDiagonal);
    }
}
