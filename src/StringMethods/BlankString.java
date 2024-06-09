package StringMethods;
/*
Checks that the string contains only whitespace characters: space, tab, new line, etc.
 */
public class BlankString {
    public static void main(String[] args) {
        String str1 = "Godfrey Okoth Ouma";
        String str2 = " ";
        System.out.println("String 1 has only whitespace characters: " +str1.isBlank());
        System.out.println("String 1 has only whitespace characters: " +str2.isBlank());
    }
}
