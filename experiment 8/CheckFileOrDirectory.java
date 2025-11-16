

import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
  
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("File/Directory exists.");
            if (file.isFile()) {
                System.out.println("It is a File.");
            } else if (file.isDirectory()) {
                System.out.println("It is a Directory.");
            }
        } else {
            System.out.println("File/Directory does not exist.");
        }
    }
}
