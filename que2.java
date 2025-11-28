import java.util.Scanner;

/**
 * Write a description of class que2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que2
{
    public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
         System.out.println("enter number");
         int number =scan.nextInt();
         if(number%2==0){
            
            System.out.println("even");
            }
        else
        {
        System.out.println("odd");
        }
    
    
    }
}