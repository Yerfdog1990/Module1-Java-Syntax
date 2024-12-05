package CollectionClasses;
/*
1.Stack Initialization: A stack is used to keep track of the opening brackets.
2.Iterate Through Input: The code iterates through each character in the input string.
3.Push Opening Brackets: If an opening bracket ('(', '{', '[') is encountered, it is pushed onto the stack.
4.Match Closing Brackets: If a closing bracket (')', '}', ']') is encountered:
5.If the stack is empty, it means there is no corresponding opening bracket, so the function returns false.
    -Otherwise, the last bracket is popped from the stack, and it is checked if it matches the closing bracket using the isMatchingPair method.
    -Final Check: After processing all characters, if the stack is empty, it means all brackets were properly paired and nested, so the function returns true. If the stack is not empty, it means there are unmatched opening brackets, so the function returns false.
6.The main method includes a few test cases to demonstrate the functionality of the areBracketsPaired method.
 */

import java.util.Stack;

public class PairedBrackets {
    // Method to check if brackets match
    public static boolean isMatchingPair(char openBracket, char closeBracket){
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '{' && closeBracket == '}')||
                (openBracket == '[' && closeBracket == ']');
    }
    //Method to check matching brackets
    public static boolean areBracketPaired(String input){
        //Initialize the stack to keep track of the brackets
        Stack<Character> characterStack = new Stack<>();
        // Iterate through each character in the input string
        for(Character ch : input.toCharArray()){
            // Push opening brackets onto the stack
            if(ch == '(' || ch == '{' || ch == '['){
                characterStack.push(ch);
            }
            // Check for matching closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or brackets don't match, return false
                if(characterStack.isEmpty()){
                    return false;
                }
                Character lastBracket = characterStack.pop();
                if(!isMatchingPair(lastBracket, ch)){
                    return false;
                }
            }
        }
        // If stack is empty, all brackets are properly paired
        return characterStack.isEmpty();
    }
    public static void main(String[] args) {
        // Test cases
        String test1 = "[{}]";
        String test2 = "[{]}";
        String test3 = "({[()]})";
        String test4 = "({[})]";

        System.out.println(test1 + " : " +areBracketPaired(test1));
        System.out.println(test2 + " ; " +areBracketPaired(test2));
        System.out.println(test3 + " ; " +areBracketPaired(test3));
        System.out.println(test4 + " ; " +areBracketPaired(test4));

    }
}
