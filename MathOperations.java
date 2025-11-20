
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
         public static void main(String[] args){
             //arithematic
  int a=5;
  int b=10;
  int c=a+b;
  int d=a-b;
  int e=a*b;
  int f=a/b;
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
//unary
int g =10;
System.out.println(g);//10
System.out.println(++g);//11

System.out.println(g);//g=11
System.out.println(++g);//12

//realtional
int h=10;
int i=11;
System.out.println(h == i);
System.out.println(h != i);
System.out.println(h > i);
System.out.println(h <i);
System.out.println(h <= i);
System.out.println(h >= i);

//Assignment
int x=10;//x=10
x +=3;//x=10+3
System.out.println(x);//10


//ternery
int age=18;
String isvalid=(age>18)?"driving is allowed":"driving is not allowed";
System.out.println(isvalid);

// logical operator

  int A = 10;
  int B = 5;
  boolean andResult = (A > 5) && (B < 10);
 boolean orResult = (A < 5) || (B < 10);
 System.out.println("A = " + A);
 System.out.println("B = " + B);
 System.out.println("AND Result: " + andResult);
 System.out.println("OR Result: " + orResult);
 
//que 2

            }
}