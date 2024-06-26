//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args){
        String a = new String("Hello");
        String b = new String("Hello");
        String c = a.intern();
        String d = b.intern();
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));
    }
}






