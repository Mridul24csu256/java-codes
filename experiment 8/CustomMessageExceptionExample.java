
class MyCustomException extends Exception {
    String message;

    public MyCustomException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Stored Exception Message: " + message);
    }
}

public class CustomMessageExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a user-defined exception message.");
        } catch (MyCustomException e) {
            e.printMessage();
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
