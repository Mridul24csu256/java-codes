import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void display() {
        System.out.printf("%7.2f %7.2f%n", x, y);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}

public class Main5 {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x and y for first point: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x and y for second point: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print("First Point: ");
        p1.display();
        System.out.print("Second Point: ");
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between points: %7.2f%n", dist);

        scanner.close();
    }
}
