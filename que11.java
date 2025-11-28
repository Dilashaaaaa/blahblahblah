import java.util.Scanner;

public class que11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        
  System.out.println("-----------------Information-----------");   
  System.out.println();
  System.out.println("1% rate for income upto 5,00,000");
  System.out.println("10% rate for income from 5,00,001 to 7,00,000");
  System.out.println("20% rate for income from 7,00,001 to 10,00,000");
  System.out.println("30% rate for income from 10,00,001 to 20,00,000");
  System.out.println("36% rate for income from 20,00,001 to 50,00,000");
  System.out.println("39% rate for income above 50,00,000");
  System.out.print("Enter your annual income (NPR): ");
        double income = scan.nextDouble();
        double tax = 0;
  
        if (income <= 500000) {
            tax = income * 0.01;   // 1%
        }
        else if (income <= 700000) {
            tax = 5000 + (income - 500000) * 0.10;   // 10%
        }
        else if (income <= 1000000) {
            tax = 15000 + (income - 700000) * 0.20;  // 20%
        }
        else if (income <= 2000000) {
            tax = 75000 + (income - 1000000) * 0.30; // 30%
        }
        else if (income <= 5000000) {
            tax = 335000 + (income - 2000000) * 0.36; // 36%
        }
        else {
            tax = 1135000 + (income - 5000000) * 0.39; // 39%
        }

        System.out.println("Total Tax Payable: NPR " + tax);
    }
}
