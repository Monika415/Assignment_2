import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\data\\input.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at the specified path.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
