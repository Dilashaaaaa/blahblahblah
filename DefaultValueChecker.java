public class DefaultValueChecker {

    // 8 Primitive Data Types (Declared but NOT initialized)
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {

        // Creating object
        DefaultValueChecker obj = new DefaultValueChecker();

        // Printing default values
        System.out.println("Default byte: " + obj.b);
        System.out.println("Default short: " + obj.s);
        System.out.println("Default int: " + obj.i);
        System.out.println("Default long: " + obj.l);
        System.out.println("Default float: " + obj.f);
        System.out.println("Default double: " + obj.d);
        
        // For char, default is '\u0000' (looks blank)
        System.out.println("Default char: '" + obj.c + "'");  

        // Default boolean is false
        System.out.println("Default boolean: " + obj.bool);

    
    }
}
