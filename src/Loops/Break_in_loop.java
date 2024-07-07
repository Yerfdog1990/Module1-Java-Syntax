package Loops;

public class Break_in_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Counter = " + i);
            }else{
                break;
            }
        }
    }
}