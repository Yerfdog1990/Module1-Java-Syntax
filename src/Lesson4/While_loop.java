package Lesson4;

public class While_loop {
    public static void main(String[] args) {
        int counter = 0;
        boolean isEnough = false;
        while(!isEnough || counter > 700){
            counter++;
            System.out.println("counter = " +counter);
            if(counter==500){
                isEnough = true;
            }
        }
    }
}
