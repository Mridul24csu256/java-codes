import java.util.Scanner;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CheckArgumentExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        try {
            System.out.print("Enter number of arguments: ");
            int n = sc.nextInt();

            
            if (n < 5) {
                throw new CheckArgumentException("Less than 5 arguments entered!");
            }

            
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }

            System.out.println("Sum of first five numbers = " + sum);

        } catch (CheckArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Program completed (finally block executed).");
        }
    }
}
