public class Systumm2 {
    public static void main(String[] args) {
        System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");

        int minutes = 99999;

        
        int totalDays = minutes / (60 * 24);

        int years = totalDays / 365;             
        int months = (totalDays % 365) / 30;     
        int days = (totalDays % 365) % 30;       

        System.out.println(minutes + " minutes = " 
                           + years + " years " 
                           + months + " months " 
                           + days + " days");
    }
}
