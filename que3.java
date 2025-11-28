import java.util.Scanner;

/**
 * Write a description of class que3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que3
{
    public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
         System.out.println("enter number");
         int number =scan.nextInt();
         if(number>=1){
            
            System.out.println("positive");
            }
        else if (number<0)
        {
        System.out.println("negative");
        }
    else {
   System.out.println("zero"); 
    }
    
    }
}