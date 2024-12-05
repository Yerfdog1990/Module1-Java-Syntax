package Try_With_Resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MultipleResourcesExample {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                PrintWriter pw = new PrintWriter("output.txt");
                ){
            String line;
            while((line = br.readLine()) != null){
                pw.println(line);
            }
        }catch (IOException e){
            System.err.println("I/O error: " +e.getMessage());
        }
    }
}
