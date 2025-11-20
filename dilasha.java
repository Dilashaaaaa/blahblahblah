import java.util.Scanner;

/**
 * Write a description of class dilasha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dilasha
{
    public static void main(String[] args)
    {
        /*Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int firstNum=scan.nextInt();//for whole numbers
        double secondnum= scan.nextDouble();//for decimal values
        System.out.println("my first number is :"+firstNum + secondnum);
        System.out.println("enter your name");
        String name =scan.next();*/
       
        //ternery operator
   
        int waterLevel = 950;  // sample value

        System.out.println(“Current Water Level: “ + waterLevel + “L”);

        String status = (waterLevel >= 1000)
                ? “WARNING: Water level has reached 1000L or more!”
                : “Status: Normal”;

        System.out.println(status);
    }
}
        
        
    
        
        
    }
}