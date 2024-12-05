package DataTypes;

public class DefaultValue {
    public static String a;
    public static int b;
    public static byte c;
    public static short d;
    public static boolean e;
    public static char f;
    public static long g;
    public static float h;
    public static double i;
    public static void main(String[] args) {

        System.out.println(String.format("The default value of string is: %s", a));
        System.out.println(String.format("The default value of integer is: %d", b));
        System.out.println(String.format("The default value of byte is: %d", c));
        System.out.println(String.format("The default value of short is: %d", d));
        System.out.println(String.format("The default value of boolean is: %b", e));
        System.out.println(String.format("The default value of character is: %c", f));
        System.out.println(String.format("The default value of long is: %d", g));
        System.out.println(String.format("The default value of float is: %f", h));
        System.out.println(String.format("The default value of double is: %f", i));
    }
}
