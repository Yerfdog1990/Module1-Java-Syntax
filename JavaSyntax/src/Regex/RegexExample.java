package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
In Java, a regular expression (regex) is a powerful tool for pattern matching and manipulation of strings.
It allows you to define a search pattern using a combination of literals, operators, and special characters.
Java provides the java.util.regex package for working with regular expressions.

Key Components of Regex in Java
1.Pattern:
A compiled representation of a regular expression.
Created using the Pattern class.
    Example: Pattern pattern = Pattern.compile("a*b");

2.Matcher:
An engine that performs match operations on a character sequence by interpreting a Pattern.
Created using the Matcher class and a Pattern instance.
    Example: Matcher matcher = pattern.matcher("aaaab");

3.PatternSyntaxException:
An unchecked exception thrown to indicate a syntax error in a regular expression pattern.

Basic Syntax of Regular Expressions
1.Literals: Match the exact characters.
    Example: 'a' matches the character 'a'.
2.Metacharacters: Characters with special meanings.
    '.': Matches any character.
    '\d': Matches a digit (0-9).
    '\D': Matches a non-digit.
    '\w': Matches a word character (alphanumeric + underscore).
    '\W': Matches a non-word character.
    '\s': Matches a whitespace character.
    '\S': Matches a non-whitespace character.
3.Quantifiers: Specify the number of occurrences.
    '*': Matches 0 or more occurrences.
    '+': Matches 1 or more occurrences.
    '?': Matches 0 or 1 occurrence.
    '{n}': Matches exactly n occurrences.
    '{n,}': Matches n or more occurrences.
    '{n,m}': Matches between n and m occurrences.
4.Anchors: Specify positions in the string.
    '^': Matches the beginning of a line.
    '$': Matches the end of a line.
5.Character Classes: Define a set of characters.
    '[abc]': Matches 'a', 'b', or 'c'.
    '[^abc]': Matches any character except 'a', 'b', or 'c'.
    '[a-z]': Matches any lowercase letter.
    '[A-Z]': Matches any uppercase letter.
4.Groups and Capturing: Define subpatterns.
    '(abc)': Matches 'abc' and captures it as a group.
    '(a|b)': Matches 'a' or 'b'.
 */
public class RegexExample {
    public static void main(String[] args) {
        String regex = "a*b";// Define the regex pattern
        Pattern pattern = Pattern.compile(regex);// Compile the pattern
        Matcher matcher = pattern.matcher("aaaaab");// Create a matcher for the string "aaab"
        // Check if the entire string matches the pattern
        boolean matches = matcher.matches();
        System.out.println("Does the string 'aaab' match the pattern 'a*b'? " +matches);
        // Check if there is a match within a larger string
        matcher = pattern.matcher("xxxaabyyy");
        while(matcher.find()){
            System.out.println("Found match at " +matcher.start()+ " to " +matcher.end());
        }
    }
}
