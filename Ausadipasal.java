import java.util.Scanner;

//import java.util.Scanner;

/**
 * Write a description of class Ausadipasal here.
 *
 * @author (your name
 * @version (a version number or a date)
 */
public class Ausadipasal
{
     public static void main(String[] args){
Scanner scan=new Scanner(System.in);
        System.out.println("enter 1st medicine name");
        System.out.println("enter 1st medicine price");
        System.out.println("enter 1st medicine quantity");
        System.out.println("enter 2nd medicine name");
        System.out.println("enter 2nd medicine price");
        System.out.println("enter 2nd medicine quantity");
        System.out.println("enter 3rd medicine name");
        System.out.println("enter 3rd medicine price");
        System.out.println("enter 3rd medicine quantity");
   String firstmedicine =scan.nextLine();
   int priceone =scan.nextInt();
   double quanone= scan.nextDouble();
   scan.nextLine();
   String secondmedicine =scan.nextLine();
   int pricetwo=scan.nextInt();
   double quantwo= scan.nextDouble();
    scan.nextLine();
   String thirdmedicine =scan.nextLine();
   int pricethree=scan.nextInt();
   double quanthree= scan.nextDouble();
   System.out.println   ("                  MEDICINES                  ");
   System.out.println();
      System.out.println  ("       NAME:"+firstmedicine               );
      System.out.println  ("       PRICE PER TABLET:Rs-"+priceone     );
      System.out.println  ("       QUANTITY:"+quanone                 );
     System.out.println();
      System.out.println  ("       NAME:"+secondmedicine              );
      System.out.println  ("       PRICE PER TABLET:Rs-"+pricetwo     );
      System.out.println  ("       QUANTITY:"+quantwo                 );
   System.out.println();
      System.out.println  ("       NAME:"+thirdmedicine               );
      System.out.println  ("       PRICE PER TABLET:Rs-"+pricethree   );
      System.out.println  ("       QUANTITY:"+quanthree               );
}
}