package Two_Dimensional_Arrays;
/*
In a 2D matrix of NxN (Square), display the values above and below the left and right diagonals
 */
public class challenge12_Display_Values {
    public static void main(String[] args) {
        int[][] array = {
                {0, 2, 3, 0},
                {5, 0, 0, 8},
                {9, 0, 0, 2},
                {0, 4, 5, 0}
        };
        System.out.println("Elements above RIGHT diagonal:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i + j < array.length - 1){
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
        System.out.println("Elements below RIGHT diagonal:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j > array.length - 1) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
        System.out.println("Elements below LEFT diagonal:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > j) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
        System.out.println("Elements above LEFT diagonal:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < j) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
    }
}
