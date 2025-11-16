import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] evenArray = new int[n];
        int[] oddArray = new int[n];
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenCount] = arr[i];
                evenCount++;
            } else {
                oddArray[oddCount] = arr[i];
                oddCount++;
            }
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" (Length: " + n + ")");

        System.out.print("Even Array: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println(" (Length: " + evenCount + ")");

        System.out.print("Odd Array: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println(" (Length: " + oddCount + ")");

        scanner.close();
    }
}
