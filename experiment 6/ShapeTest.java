abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}
class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    void SquareArea(double side) {
        System.out.println("Area of Square: " + (side * side));
    }
    void CircleArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.RectangleArea(5, 10);
        obj.SquareArea(4);
        obj.CircleArea(3);
    }
}
