
/**
 * Write a description of class tutorialc3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorialc3
{
    int age;//instance variable
    static int qty;//static variable
    public static void main(String[] args){
     int n1=20;//local variable
     System.out.println(n1);
    //Implicit Typecasting
    double dt=n1;
    System.out.println(dt);
    //Explicit Typecasting
    double db=10.01;
    int itr=(int)db;
    System.out.println(itr);
    //finding min max size and bytes
    System.out.println(Byte.MAX_VALUE);//return max value
    System.out.println(Byte.MIN_VALUE);//returns min value
    System.out.println(Byte.SIZE);//returns bits
    System.out.println(Byte.BYTES);//returns bytes
    //escape sequence
    System.out.println("hello\nworld");//new line
    System.out.println("Hamro\tNepal");//tab
    System.out.println("he said\"hi\" ");//quotation
    //unicode escape
    System.out.println("\u1F43C");
    
    
    
    }
}