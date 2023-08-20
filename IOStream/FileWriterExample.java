import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try {
            FileWriter writer = new FileWriter(filePath);

            writer.write("Hello, this is a simple file writing example in Java!");
            
            writer.close();

            System.out.println("File has been written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
