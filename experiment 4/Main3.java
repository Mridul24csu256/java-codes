import java.util.Scanner;

class Area {
    double length;
    double breadth;

    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double returnArea() {
        return length * breadth;
    }
}

public class Main3 {
    public static void main(String[] args) {
     System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.returnArea());

        scanner.close();
    }
}
