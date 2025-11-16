

import java.io.*;

public class SimpleReadWrite {
    public static void main(String[] args) {
        String data = "Hello, this is a simple file write and read example.";

        try {
           
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(data);
            writer.close();
            System.out.println("Data written successfully.");

         
            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.println("File contents:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
