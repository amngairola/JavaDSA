package Optionals;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();

        mp.put("A", 200);
        // System.out.println(mp.get('b'));

        Optional<Integer> op = Optional.ofNullable(mp.get("b"));

        if (op.isPresent()) {
            System.out.println("Value is: " + op.get());
        } else {
            System.out.println("No value present");
        }
    } 
    static void OptionalCreation() {

        /*
         * !Optional
         * is a container object which may or may not contain a non-null value. It is
         * used to represent the presence or absence of a value. This helps in avoiding
         * null pointer exceptions and writing more readable and expressive code by
         * making the absence of a value explicit.
         */

        // ****Creating an Optional****//

        // 1-Empty Optional:

        Optional<String> emptyOptional = Optional.empty();

        // 2- Optional with a value:

        Optional<String> optionalWithValue = Optional.of("Hello, World!");

        // 3- Optional that may or may not have a value:

        String value = null;
        Optional<String> optionalValue = Optional.ofNullable(value);

        // Check if value is present
        if (optionalWithValue.isPresent()) {
            System.out.println("Value is: " + optionalWithValue.get());
        } else {
            System.out.println("No value present");
        }

        // Providing a default value
        String defaultValue = optionalWithValue.orElse("Default Value");
        System.out.println("Value or default: " + defaultValue);
        
         // Executing a block if value is present
         optionalWithValue.ifPresent(value ->
         System.out.println("Value from ifPresent: " + value));
         
         // Transforming the value if present
         Optional<String> upperCaseOptional =
         optionalWithValue.map(String::toUpperCase);
         upperCaseOptional.ifPresent(value -> System.out.println("Transformed value: "
         + value));
         }
        
    }

}
