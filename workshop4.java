import java.util.Scanner;

/**
 * Write a description of class workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop4
{
    public static void main (String[] args){
    
        Scanner scan=new Scanner(System.in);
         System.out.println("enter marks");
         int marks =scan.nextInt();
         if(marks>35){
            
            System.out.println("passed");
            }
        else
        {
        System.out.println("failed");
        }
    
    
    }
}

         