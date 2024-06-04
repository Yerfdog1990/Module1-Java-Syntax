package Access_modifiers1;

public class Test_public {
    public static void main(String[] args) {
        PublicAccess example1 = new PublicAccess();

        // Accessing public field and method
        System.out.println(example1.publicField); // Output: I am public
        example1.publicMethod(); // Output: Public method
    }
}
