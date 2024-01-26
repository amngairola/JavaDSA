package StringBuilder;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = (float) 234.5543422;
        // System.out.printf('formated number is %.3f', a);
        /*
         * to appears to have a syntax error. The correct syntax in Java for formatting
         * a string using printf #Use double quotes (") for specifying the string
         * literal.
         */
        System.out.printf("formatad number is %.3f", a);
        System.out.printf("hello %s , %s", "Aman", "Welcome");
    }

}
