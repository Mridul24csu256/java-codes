import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
