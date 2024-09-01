package Project1Demo;

import java.util.Scanner;

//A Java Program to illustrate Caesar Cipher Technique
class CaesarCipher{
    // Encrypts text using a shift of s
    public static StringBuffer encrypt(String text, int s){
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            }else{
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        try (Scanner userInput = new Scanner(System.in)){
            System.out.print("Enter text: ");
            String text = userInput.nextLine();
            System.out.print("Enter the key: ");
            int key = userInput.nextInt();
            System.out.println("Text  : " + text.toUpperCase());
            System.out.println("Shift : " + key);
            System.out.println("Cipher: " + encrypt(text.toUpperCase(), key));
        }
    }
}

