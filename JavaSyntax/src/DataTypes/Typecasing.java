package DataTypes;

public class Typecasing {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 127;
        byte c = (byte)(a * b);
        short d = (short) (a * b);
        int e = a * b;
        long f = a * b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
