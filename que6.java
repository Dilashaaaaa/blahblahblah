import java.util.Scanner;

/**
 * Write a description of class que6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que6
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marked price of the item: ");
        float mp = scan.nextFloat();
        System.out.print("Enter the category of the item (A/B/C/D): ");
        char category = scan.next().charAt(0);
         float sp;
        float discountPercent = 0;
        if (category == 'A' ) {
        sp = mp - (mp * 0.60f);
        } 
        else if (category == 'B') {  
            sp = mp - (mp * 0.40f);
        }
        else if (category == 'C' ) {
          sp = mp - (mp * 0.20f);
        } 
        else if (category == 'D') {
             sp = mp - (mp * 0.10f);
        } 
        else {
            System.out.println("Invalid category entered!");
            return;
        }

    
        System.out.println("Selling Price = " + sp);
    }
}

        
        
        
        
