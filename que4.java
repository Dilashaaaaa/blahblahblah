import java.util.Scanner;

/**
 * Write a description of class que4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que4
{
    public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
         System.out.println("enter number");
         int number =scan.nextInt();
         
      if (number%5==0 && number%3==0)
       {
        
        System.out.println("Divisible by both 3 and 5 ");
        
        }
                else {
                System.out.println("not divisible by both");
                
                }
        }
    
    
    
    
}