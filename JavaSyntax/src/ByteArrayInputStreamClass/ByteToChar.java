package ByteArrayInputStreamClass;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class ByteToChar {
    public static void main(String[] args) {
        String input = "O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChar(byteArrayInputStream, 38)));
    }
    public static char[] bytesToChar(ByteArrayInputStream stream, int n){
        byte[] bytes = stream.readAllBytes();
        int minLength = Math.min(n, bytes.length);
        char[] result = new char[minLength];
        for (int i = 0; i < minLength; i++) {
            result[i] = (char) bytes[i];
        }
        return result;
    }
}
