package Try_With_Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        File file = new File("example.txt");
        Scanner userInput = null;
        // Using try-catch-finally to manage the Scanner resource
        try{
            userInput = new Scanner(file);
            while (userInput.hasNext()){
                String line = userInput.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.err.println("File not found: " +file.getAbsolutePath());
        }
        finally {
            if(userInput != null){
                userInput.close();
            }
        }
    }
}
