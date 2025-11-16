import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int[] temp = new int[5];
        int newSize = 0;

        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }

        scanner.close();
    }
}
