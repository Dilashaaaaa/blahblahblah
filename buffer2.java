import java.util.Scanner;

public class buffer2
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price of the medicine");
        int MedPrice = scan.nextInt();

    

        System.out.println("Enter name of the medicine:");
        String MedName = scan.nextLine();

        System.out.println("Enter quantity");
        int Quantity = scan.nextInt();

        System.out.println(MedName + " costs " + MedPrice + " NPR for each " + Quantity + " box");
    }
}
