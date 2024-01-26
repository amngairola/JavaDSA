package StringBuilder;

// javac Operator.java
// java Operator.java
public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'a'); // when you use the + operator with two characters, Java treats them as integers
                                       // according to their Unicode values and performs integer addition. {When you
                                       // use 'a' + 'a', it's essentially 97 + 97.}

        System.out.println("a" + "a");
        System.out.println((char) ('a' + 25)); // z
        System.out.println("a" + 25);
        /*
         * a25 ,Since one of the operands ("a") is a string, Java treats the + operator
         * as a string concatenation operator. Therefore, "a" and 25 are concatenated
         * together as strings.
         * The integer 25 is converted to its string representation and then
         * concatenated with the string "a".
         */
    }
}
