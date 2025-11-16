import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array in reverse order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
