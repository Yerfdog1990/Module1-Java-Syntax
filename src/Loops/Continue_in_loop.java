package Loops;

public class Continue_in_loop {
    public static void main(String[] args) {
        int x = 0;
        while(x < 20){
            x++;
            if(x % 2 == 0){
                continue;
            }
            System.out.println(x);
        }
    }
}
