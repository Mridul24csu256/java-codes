

import java.io.*;

public class BufferedReadWriteExample {
    public static void main(String[] args) {
        String fileName = "student.txt";

        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Serial No: 1");
            bw.newLine();
            bw.write("First Name: Ansh");
            bw.newLine();
            bw.write("CGPA: 8.7");
            bw.newLine();
            bw.write("Grade: A");
            bw.newLine();
            bw.close();
            System.out.println("Data written successfully using BufferedWriter.");

         
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading file contents using BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
