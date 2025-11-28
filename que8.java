import java.util.Scanner;

/**
 * Write a description of class que8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que8
{
    public static void main (String[] args){
     Scanner scan=new Scanner(System.in);
     System.out.println("enter your GPA");
     float GPA=scan.nextFloat();
     if (GPA<0.0 || GPA>4.0)
     {
         System.out.println("GPA is invalid enter in range (0.0 to 4.0");
        
     }
     if(GPA >=3.6 && GPA<=4.0)
     {
        System.out.println("your grade is A+");
        }
     
        else if (GPA >=3.2 && GPA<=3.5){
        
        System.out.println("your grade is A");
       
        }
        else if (GPA >=2.8 && GPA<=3.1)
        
       {
     System.out.println("your grade is B+");        
        }
    else if (GPA >=2.4 && GPA<=3.7)
    
    {
        System.out.println("your grade is B");
    }
    
     else if (GPA >=2.0 && GPA<=2.3)
     {
         System.out.println("your grade is c+");
        }
        
      else {
      System.out.println("you failed");
    }
}
}