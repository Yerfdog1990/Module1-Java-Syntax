package StringMethods;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = new String("Godfrey");
        String str2 = new String("Godfrey");
        String strpool1 = str1.intern();
        String strpool2 = str2.intern();
        System.out.println("str1 is similar to str2: " +(str1==str2));
        System.out.println("strpool1 similar to strpool2: " +(strpool1==strpool2));
    }
}
