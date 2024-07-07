package ArrayList;

import java.util.ArrayList;
/*
Flipping data
The init() method should populate the numbers list with numbers from 0 to 9.
The reverse() method should put the values of the numbers list into reverse order.
 */
public class Challenge04ArrayList {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

