# Java String Methods

In Java, strings are objects of the `String` class, which provides numerous methods for manipulating and working with strings. Below are some commonly used string methods:

```java
String str = "Hello";
int length = str.length();
System.out.println(length); // Output: 5
charAt(int index)

Returns the character at the specified index within the string.
```

```
java
Copy code
String str = "Hello";
char ch = str.charAt(0);
System.out.println(ch); // Output: 'H'
concat(String str)
Concatenates the specified string to the end of the invoking string.
```

```
java
Copy code
String str1 = "Hello";
String str2 = " World";
String result = str1.concat(str2);
System.out.println(result); // Output: "Hello World"
indexOf(String str)
Returns the index within the calling string of the first occurrence of the specified substring.
```

```
java
Copy code
String str = "Hello World";
int index = str.indexOf("World");
System.out.println(index); // Output: 6
substring(int startIndex, int endIndex)
Returns a new string that is a substring of the calling string, starting from the startIndex up to, but not including, the endIndex.
```

```
java
Copy code
String str = "Hello World";
String subStr = str.substring(6);
System.out.println(subStr); // Output: "World"
split(String regex)
Splits the calling string into an array of substrings based on the specified regular expression.
```

```
java
Copy code
String str = "Hello World";
String[] parts = str.split(" ");
for (String part : parts) {
    System.out.println(part);
}
// Output:
// Hello
// World
toLowerCase()
```

## Converts all of the characters in the string to lowercase.

```
java
Copy code
String str = "HELLO";
String lowerCaseStr = str.toLowerCase();
System.out.println(lowerCaseStr); // Output: "hello"
toUpperCase()
Converts all of the characters in the string to uppercase.
```

```
java
Copy code
String str = "hello";
String upperCaseStr = str.toUpperCase();
System.out.println(upperCaseStr); // Output:
```

##### convert a string to a character array and vice versa

String to Char Array:
You can convert a string to a character array using the toCharArray() method of the String class. This method returns a newly allocated character array containing the characters of the string.

```
java
Copy code
String str = "Hello";
char[] charArray = str.toCharArray();


```

Char Array to String:
You can convert a character array to a string using the String class constructor that accepts a character array as an argument.

```

char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String str = new String(charArray);
```

To convert a char to a String in Java, you have a few options. Here are two common methods:

Using String.valueOf(char):

```
java

char myChar = 'a';
String myString = String.valueOf(myChar);
Using Character.toString(char):
```

java

```
char myChar = 'a';
String myString = Character.toString(myChar);
```
