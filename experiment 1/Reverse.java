public class Reverse {
    public static void main(String[] args) {
        System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");

        int num = 12345;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;   
            rev = rev * 10 + digit; 
            num = num / 10;         
        }

        System.out.println("Reverse = " + rev);
    }
}
