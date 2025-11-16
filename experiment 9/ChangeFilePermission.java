

import java.io.File;

public class ChangeFilePermission {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            if (file.exists()) {
           
                file.setReadable(true);
                file.setWritable(false);
                file.setExecutable(false);

                System.out.println("File permissions changed successfully!");
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Executable: " + file.canExecute());
            } else {
                System.out.println("File not found!");
            }
        } catch (Exception e) {
            System.out.println("Error while changing permissions: " + e.getMessage());
        }
    }
}
