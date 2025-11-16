import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = sc.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

        sc.close();
    }
}
