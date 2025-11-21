import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("  Biratnagar Rickshaw Fare Calculator ");
        System.out.println("======================================\n");

        int BASE_FARE = 50;
        int PER_KM = 20;
        int PER_MIN = 2;
        double LOCAL_DISCOUNT = 0.10;
        double NIGHT_SURCHARGE = 0.20;
        int LONG_DISTANCE_THRESH = 10;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double distance = scan.nextDouble();

        System.out.print("Enter time in minutes: ");
        int minutes = scan.nextInt();

        // are you local
        System.out.print("Are you local? (yes/no): ");
        String localStr = scan.next();

        String localStatus = localStr.equalsIgnoreCase("yes")
                ? "Local Customer"
                : "Non-Local Customer";

        System.out.println(localStatus);

        // is it night
        System.out.print("Is it night time? (yes/no): ");
        String nightStr = scan.next();

        String nightStatus = nightStr.equalsIgnoreCase("yes")
                ? "Night Charge Applied"
                : "Normal Day Fare";

        System.out.println(nightStatus);

        //  Fare calculation 
        double totalFare = BASE_FARE + (distance * PER_KM) + (minutes * PER_MIN);

        // local discount
        totalFare = (localStr.equalsIgnoreCase("yes") && distance > LONG_DISTANCE_THRESH)
                ? totalFare * (1 - LOCAL_DISCOUNT)
                : totalFare;

        // total fare
        totalFare = nightStr.equalsIgnoreCase("yes")
                ? totalFare * (1 + NIGHT_SURCHARGE)
                : totalFare;

    //gives output
        System.out.println("\n--------------------------------------");
        System.out.println("            Final Fare ");
        System.out.println("--------------------------------------");
        System.out.println("Total Fare: Rs. " + totalFare);
        System.out.println("--------------------------------------");
        System.out.println(" Thank you for choosing Biratnagar Rickshaw Service!");
        System.out.println("======================================");
    }
}
