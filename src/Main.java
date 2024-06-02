//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void fill(int[][] array, int value){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
            }
        }
    }

    public static void main(String[] args) {
        int array[][] = {{2, 3, 4}, {4, 5, 2}, {8, 2, 0}};
        fill(array, 8);
    }
}






