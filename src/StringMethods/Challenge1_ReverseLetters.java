package StringMethods;

public class Challenge1_ReverseLetters {
    public static void main(String[] args) {
        String originalString = "madam";
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(originalString);
        reversedString = reversedString.reverse();
        System.out.println("Original string: " +originalString);
        System.out.println("Reversed string: " +reversedString.toString());
    }
}
