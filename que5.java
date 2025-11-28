import java.util.Scanner;

/**
 * Write a description of class que5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que5
{
    
public static void main (String[] args){
 Scanner scan=new Scanner(System.in);
         System.out.println("enter number");
         int number =scan.nextInt();
        if (number%3==0)
        {
        if (number%5==0)
        {
        System.out.println("divisible by both");
        }
        else 
        {
        System.out.println("divisible by 3 not 5");
        }}
        
        else{ 
            
        if(number%5==0)
        {
            System.out.println("Divisible by 5 not 3");
        }
        else{
        System.out.println("not divisible by both");
        
        }
        }
        
             
        }
    
    }

