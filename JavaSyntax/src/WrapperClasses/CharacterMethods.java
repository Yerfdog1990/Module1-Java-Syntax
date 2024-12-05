package WrapperClasses;
/*
The Character class is interesting primarily for its large number of static utility methods
that let you check whether characters belong to various categories.
Examples
1.Character.isAlphabetic(int) - Checks whether a character is an alphabetic character
2.Character.isLetter(char) - Checks whether the character is a letter
3.Character.isDigit(char) - Checks whether the character is a digit
4.Character.isSpaceChar(char) - Checks whether the character is a space, a line break, or
a page break (codes: 12, 13, 14)
5.Character.isWhitespace(char) - Checks whether the character is whitespace: a space, tab, etc.
6.Character.isLowerCase(char) - Checks whether the character is lowercase
7.Character.isUpperCase(char) - Checks whether the character is uppercase
8.Character.toLowerCase(char) - Converts the character to lowercase
9.Character.toUpperCase(char) - Converts the character to uppercase

NB:A feature of these methods is that they work with all known alphabets: Arabic numerals are classified as digits, etc.
 */
public class CharacterMethods {
    public static void main(String[] args) {

        //1.Check whether a character is an alphabetic character
        char ch1 = 'A';
        System.out.println(String.format("Is \"%c\" alphabetic? %b.", ch1, Character.isAlphabetic(ch1)));

        //2.Check whether the character is a letter
        char ch2 = 'a';
        char ch3 = '1';
        System.out.println(String.format("Is \"%c\" a letter? %b.", ch2, Character.isLetter(ch2)));
        System.out.println(String.format("Is \"%c\" a letter? %b.", ch3, Character.isLetter(ch3)));

        //3.Check whether the character is a digit
        char ch4 = 'a';
        char ch5 = '1';
        System.out.println(String.format("Is \"%c\" a digit? %b.", ch4, Character.isDigit(ch4)));
        System.out.println(String.format("Is \"%c\" a digit? %b.", ch5, Character.isDigit(ch5)));

        //4.Checks whether the character is a space, a line break, or a page break (codes: 12, 13, 14)
        char ch6 = ' ';
        char ch7 = '\n';
        System.out.println(String.format("Is \"%c\" a space character? %b.", ch6, Character.isSpaceChar(ch6)));
        System.out.println(String.format("Is \"%c\" a whitespace character? %b.", ch7, Character.isWhitespace(ch7)));

        //5.Check whether the character is lowercase
        System.out.println(String.format("Is \"%c\" a lowercase? %b.", ch1, Character.isLowerCase(ch1)));
        System.out.println(String.format("Is \"%c\" a lowercase? %b.", ch2, Character.isLetter(ch2)));

        //6.Check whether the character is lowercase
        System.out.println(String.format("Is \"%c\" a uppercase? %b.", ch1, Character.isUpperCase(ch1)));
        System.out.println(String.format("Is \"%c\" a uppercase? %b.", ch2, Character.isUpperCase(ch2)));

        //7.Covert to lowercase/uppercase
        System.out.println(String.format("\"%c\" converted to lowercase is \"%c\".", ch1, Character.toLowerCase(ch1)));
        System.out.println(String.format("\"%c\" converted to uppercase is \"%c\".", ch2, Character.toUpperCase(ch2)));
    }
}
