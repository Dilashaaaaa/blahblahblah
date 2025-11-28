import java.util.Scanner;

/**
 * Write a description of class que7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que7
{
    
public static void main (String[] args){

 Scanner scan = new Scanner(System.in);

        System.out.print("Enter marked price: ");
        float mp = scan.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        char category = scan.next().charAt(0);

        float discount = 0;

        switch (category) {
            case 'A':
            discount = 0.60f;
                break;

            case 'B':
   
                discount = 0.40f;
                break;

            case 'C':
           
                discount = 0.20f;
                break;

            case 'D':
                discount = 0;
                break;
        
                
                default:
                    System.out.print("invalid");
        }

        float sp=mp - (mp * discount);

        System.out.println("Selling Price = " + sp);
    }
}




