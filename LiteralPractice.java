public class LiteralPractice {

    public static void main(String[] args) {

        // Long literal (must use 'L' suffix)
        long population = 7800000000L;

        // Float literal (must use 'f' suffix)
        float price = 99.99f;

        // Char literal using Unicode escape sequence (© = \u00A9)
        char copyrightSymbol = '\u00A9';

        // Printing values
        System.out.println("Long value: " + population);
        System.out.println("Float value: " + price);
        System.out.println("Char (Unicode ©): " + copyrightSymbol);
    }
}
