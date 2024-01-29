package StringBuilder;

// Docs : https://www.javatpoint.com/StringBuilder-class
public class Sb {
    /*
     * * Java StringBuilder class is used to create mutable (modifiable) String. The
     * Java StringBuilder class is same as StringBuffer class except that it is
     * non-synchronized. It is available since JDK 1.5.
     */

    // javac Sb.java
    // java Sb.java
    public static void main(String[] args) {
        // Way 1 of creating a new String by overloading Stringbuider constuctor;
        StringBuilder builder = new StringBuilder(); /*
                                                      * it creates an empty String Builder with the initial capacity of
                                                      * 16.
                                                      */

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            builder.append(c); /*
                                * It is used to append the specified string with this string. The append()
                                * method is overloaded like append(char), append(boolean), append(int),
                                * append(float), append(double) etc.
                                */
        }

        System.out.println(builder);

        // Way 2 of creating a new String by overloading Stringbuider constuctor;

        StringBuilder sb = new StringBuilder("Aman"); // It creates a String Builder with the specified string.
        System.out.println(sb);

        // Way 3 of creating a new String by overloading Stringbuider constuctor;
        StringBuilder s = new StringBuilder(5); // t creates an empty String Builder with the specified capacity as
                                                // length.
        System.out.println(s.capacity());
        s.append("hello Aman welcome here");/*
                                             * This line appends the string "hello Aman welcome here" to the
                                             * StringBuilder object s. If the capacity is insufficient to hold the
                                             * entire string, the StringBuilder automatically increases its capacity to
                                             * accommodate the appended text.
                                             */

        System.out.println(s);
        System.out.println(s.capacity());/*
                                          * This line prints the current capacity of the StringBuilder object s to the
                                          * console. Since the capacity is dynamically adjusted to accommodate the
                                          * appended string, it will print a value greater than or equal to the length
                                          * of the appended string plus the initial capacity. The exact value depends on
                                          * the implementation of the StringBuilder class and may vary.
                                          */

    }
}