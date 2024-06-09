package StringMethods;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = new String("Godfrey").intern();
        String str2 = "Godfrey";
        System.out.println("Sring 1 is similar to string 2: " +(str1==str2));
    }
}
