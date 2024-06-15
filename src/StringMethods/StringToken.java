package StringMethods;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String name = "Godfrey Okoth Ouma";
        StringTokenizer token = new StringTokenizer(name, "G");
        while(token.hasMoreTokens()){
            String tokenizer = token.nextToken();
            System.out.println(tokenizer);
        }
    }
}
