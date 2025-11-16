import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal: " + r + " and " + r);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " + " + imaginaryPart + "i and "
                               + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}
