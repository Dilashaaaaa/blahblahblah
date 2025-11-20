import java.util.Scanner;

/**
 * Write a description of class waterlevelmonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class waterlevelmonitor
{
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter water level");
int waterlevel=scan.nextInt();
String isValid=(waterlevel>=1000)? "warning:water level has reached more than 1000":"normal status:water is at normal level";
System.out.println(isValid);
}
}