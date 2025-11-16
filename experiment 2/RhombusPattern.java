import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the number of rows for the rhombus: ");
            int rows = sc.nextInt();

            
            System.out.print("Enter the character to use: ");
            char ch = sc.next().charAt(0);

            
            System.out.println("\nRhombus Pattern:\n");

            
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }

            
            System.out.print("\nDo you want to try again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program exited. Thank you!");
        sc.close();
    }
}
