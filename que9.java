import java.util.Scanner;

/**
 * Write a description of class que9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que9
{
    public static void main (String[] args){
     Scanner scan=new Scanner(System.in);
     System.out.println("enter your GPA");
       System.out.println("enter your Attendance%");
         System.out.println("enter your Attitude");
     float GPA=scan.nextFloat();
     int Attendance=scan.nextInt();
     int Attitude =scan.nextInt();
       if (GPA >= 3.2) 
       {
           
            if (Attendance > 80)
            {
                if (Attitude < 5) 
                {
                    System.out.println("Student is eligible for scholarship.");
                } 
            }
        
                
           else {
                    System.out.println("Not eligible");
}
 
}
  }
}
    
    