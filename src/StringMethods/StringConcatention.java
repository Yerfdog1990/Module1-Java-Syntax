package StringMethods;

public class StringConcatention {
    public static void main(String[] args) {
        String originalString = "Godfrey";
        String modifiedString = originalString.concat(" Ouma");
        System.out.println(String.format("The orginal string is %s", originalString));
        System.out.println(String.format("The modified string is %s", modifiedString));
    }
}
