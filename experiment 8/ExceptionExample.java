

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a manually thrown exception.");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Cleaning up resources.");
        }
    }
}
