import java.util.Scanner;

public class RickshawFare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in (km): ");
        double distance = scan.nextDouble();

        System.out.print("Enter time in (minutes): ");
        double time = scan.nextDouble();

        System.out.print("Are you a local? (yes/no): ");
        String localInput = scan.next().toLowerCase();

        System.out.print("Is it night time? (yes/no): ");
        String nightInput = scan.next().toLowerCase();

        boolean isLocal = localInput.equals("yes") ? true : false;
        boolean isNight = nightInput.equals("yes") ? true : false;


        
         int baseFare = 50;             // Rs. 50
         int perKm = 20;                // Rs. 20 per km
         int perMinute = 2;             // Rs. 2 per minute
        double longDistanceDiscount = 0.10; // 10% discount for locals if > 10 km
        double nightSurcharge = 0.20;     // 20% extra at night


        double totalFare = baseFare + (distance * perKm) + (time * perMinute);

        if (isLocal && distance > 10) {
            totalFare = totalFare - (totalFare * longDistanceDiscount);
        }

        if (isNight) {
            totalFare = totalFare + (totalFare * nightSurcharge);
        }

        System.out.println("\nFinal Fare: Rs. " + Math.round(totalFare));
    }
}
