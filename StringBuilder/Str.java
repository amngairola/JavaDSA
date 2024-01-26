package StringBuilder;

// string doc =  https://www.javatpoint.com/java-string

// What is String in Java?
// Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

// How to create a string object?
// There are two ways to create String object:
// By string literal
// By new keyword

// 1) String Literal
// Java String literal is created by using double quotes. For Example:

public class Str {
    public static void main(String[] args) {
        // way 2 of creating a object using String literal
        String s1 = "welcome";
        String s2 = "welcome";
        /*
         * Each time you create a string literal, the JVM checks the
         * "string constant pool" first. If the string already exists in the pool, a
         * reference to the pooled instance is returned. If the string doesn't exist in
         * the pool, a new string instance is created and placed in the pool. For
         * example:
         */
        System.out.println(s1 == s2); // == operator is used to compare the memory addresses of the two strings (s1 and s2)

        // System.out.println(s1.equals(s2)); // compare the content of the strings,

        // System.out.println(s2);
        // in java string are immutable , immutable means we can not change the string object once we created , but we can create a new object having same name as previous object 

        // s2 = "mew"; // here we are not changing the previous object but creating a new instance and returning the refrence of it to s2 now;

        /*Why Java uses the concept of String literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). */

// way 2 of creating a object using new Keyword
String a=new String("aman");//creates two objects and one reference variable  
String b=new String("aman");//creates two objects and one reference variable  
/*
In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "aman" will be placed in the string constant pool. The variable a will refer to the object in a heap (non-pool).
*/
System.out.println(a == b);
    }
}
