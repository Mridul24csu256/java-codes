import java.util.Scanner;

class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    Complex multiply(Complex c) {
        double realPart = this.real * c.real - this.imag * c.imag;
        double imagPart = this.real * c.imag + this.imag * c.real;
        return new Complex(realPart, imagPart);
    }

    void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class Main4 {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = scanner.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = scanner.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();

        scanner.close();
    }
}
