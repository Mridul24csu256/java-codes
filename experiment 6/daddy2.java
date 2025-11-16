interface A {
    void showA();
}
interface B extends A {
    void showB();
}
class Example implements B {
    public void showA() {
        System.out.println("Inside showA()");
    }
    public void showB() {
        System.out.println("Inside showB()");
    }
}
public class daddy2 {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.showA();
        obj.showB();
    }
}
