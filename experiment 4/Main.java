class Student {
    String name;
    int roll_no;
}

public class Main {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Student student = new Student();
        student.name = "John";
        student.roll_no = 2;

        System.out.println("Student Name: " + student.name);
        System.out.println("Student Roll No: " + student.roll_no);
    }
}
