package StringMethods;
/*
Joins multiple substrings together
 */
public class JoinString {
    public static void main(String[] args) {
        String[] str = {"Godfrey", "Okoth", "Ouma"};
        System.out.println("Joined string: " +String.join(" ", str));
    }
}
