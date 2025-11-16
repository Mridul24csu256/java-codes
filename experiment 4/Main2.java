class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    int perimeter() {
        return a + b + c;
    }

    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Main2 {
    public static void main(String[] args) {
     System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Triangle triangle = new Triangle();
        System.out.println("Perimeter of the triangle: " + triangle.perimeter());
        System.out.println("Area of the triangle: " + triangle.area());
    }
}
