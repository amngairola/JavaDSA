# Java ArrayList

## What is an ArrayList?

An ArrayList in Java is a resizable array implementation of the List interface provided by the Java Collections Framework. It allows dynamic resizing of the underlying array to accommodate adding or removing elements. ArrayLists provide more functionality and flexibility compared to regular arrays.

## How to Create an ArrayList?

You can create an ArrayList in Java using the ArrayList class provided in the java.util package. Here's how you can create an ArrayList:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
    }
}

```

## Iterating Over an ArrayList

You can iterate over the elements of an ArrayList using various methods, such as for-each loop or Iterator. Here's an example using a for-each loop:

```
java
Copy code
for (String item : arrayList) {
    System.out.println(item);
}

```

### Common Methods of ArrayList

ArrayList provides several methods for adding, removing, accessing elements, and more. Some of the commonly used methods include:

add(E element): Adds an element to the end of the ArrayList.

add(int index, E element): Inserts an element at the specified index.

remove(int index): Removes the element at the specified index.

remove(Object obj): Removes the first occurrence of the specified element.

get(int index): Returns the element at the specified index.

set(int index, E element): Replaces the element at the specified index with the specified element.

size(): Returns the number of elements in the ArrayList.

clear(): Removes all elements from the ArrayList.
Here's an example demonstrating some of these methods:

```
java
Copy code
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add("Orange");

System.out.println("Size of ArrayList: " + arrayList.size());

System.out.println("Element at index 1: " + arrayList.get(1));

arrayList.remove("Banana");
System.out.println("After removing 'Banana': " + arrayList);

<!-- This will output:
mathematica
Copy code
Size of ArrayList: 3
Element at index 1: Banana
After removing 'Banana': [Apple, Orange] -->
```
