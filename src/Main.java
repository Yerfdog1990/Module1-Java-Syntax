//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args){
        System.out.println(toDecimal(123));
    }
    public static int toDecimal(int octalNumber){
        int decimalNumber = 0;
        if(octalNumber <= 0){
            return decimalNumber;
        }
        for (int i = 0; octalNumber != 0; i++) {
            decimalNumber = (int)(decimalNumber + (octalNumber % 10)*Math.pow(8, i));
            octalNumber = octalNumber/10;
        }
        return decimalNumber;
    }
}






