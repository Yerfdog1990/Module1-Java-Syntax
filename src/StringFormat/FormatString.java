package StringFormat;

public class FormatString {
    public static void main(String[] args) {
        isMyname("Godfrey");
        isMyage(34);
        isFirstLetter('G');
        isMycountry(true);
        isMymass(91.64);
    }
    public static void isMyname(String name){
        String result = String.format("My name is %s", name);
        System.out.println(result);
    }
    public static void isMymass(double mass){
        String result = String.format("I have a mass of %.2fkg", mass);
        System.out.println(result);
    }
    public static void isMyage(int age){
        String result = String.format("I am %d years old", age);
        System.out.println(result);
    }
    public static void isFirstLetter(char letter){
        String result = String.format("The first letter of my name is %c", letter);
        System.out.println(result);
    }
    public static void isMycountry(boolean citizenship){
        String result = String.format("It is %b that I am a Kenya citizen by birth", citizenship);
    }
}
