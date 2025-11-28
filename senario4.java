import java.util.Scanner;

public class senario4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double basePrice = 0;
        double price = 0;
        double finalPrice;

        System.out.println("Enter age group (child / adult / senior): ");
        String ageGroup = scan.nextLine();

        System.out.println("Enter movie language (nepali / hindi / english): ");
        String language = scan.nextLine();

        System.out.println("Are you a student? (yes/no): ");
        String isStudent = scan.nextLine();

        System.out.println("Is it a festival day? (yes/no): ");
        String isFestival = scan.nextLine();

        
        switch (ageGroup) {
            case "child":
                basePrice = 150;
                break;

            case "adult":
                basePrice = 250;
                break;

            case "senior":
                basePrice = 200;
                break;

            default:
                System.out.println("Invalid age group!");
                return;
        }

        
        if (language.equals("nepali")) {
            price = basePrice;  
        }
        else if (language.equals("hindi")) {
            price = basePrice + 50;
        }
        else if (language.equals("english")) {
            price = basePrice + 100;
        }
        else {
            System.out.println("invalid");
            return;
        }

        finalPrice = price;

        if (isStudent.equals("yes")) 
        {
            finalPrice = finalPrice * 0.20;  
        }

        if (isFestival.equals("yes")) 
        {
            finalPrice = finalPrice * 0.15;  
        }

        System.out.println("---------------------------------");
        System.out.println("Final Ticket Price: Rs. " + finalPrice);
        System.out.println("---------------------------------");
    }
}
