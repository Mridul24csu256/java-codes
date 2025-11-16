abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    double sub1, sub2, sub3;
    A(double s1, double s2, double s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    double getPercentage() {
        return ((sub1 + sub2 + sub3) / 300) * 100;
    }
}
class B extends Marks {
    double sub1, sub2, sub3, sub4;
    B(double s1, double s2, double s3, double s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }
    double getPercentage() {
        return ((sub1 + sub2 + sub3 + sub4) / 400) * 100;
    }
}
public class MarksTest {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 85);
        B studentB = new B(70, 75, 80, 85);
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
