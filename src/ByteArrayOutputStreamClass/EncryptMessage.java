package ByteArrayOutputStreamClass;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class EncryptMessage {
    public static void main(String[] args) {
        try(Scanner userInput = new Scanner(System.in)) {
            System.out.print("Message to encrypt: ");
            String name = userInput.nextLine();
            System.out.println("Encrypted message: " +encrypt(name));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static ByteArrayOutputStream encrypt(String message){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] byteArray = message.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < byteArray.length/2; i++) {
            stream.write(byteArray[i]);
            stream.write(byteArray[byteArray.length - i -1]);
        }
        if(byteArray.length % 2 == 1){
            stream.write(byteArray[byteArray.length/2]);
        }
        return stream;
    }
}
