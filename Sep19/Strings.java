


public class Strings {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    


// Strings in Java: Comprehensive Notes

// Strings are a fundamental part of programming in Java. They are used extensively in applications for representing and manipulating text data. This guide covers all the important aspects of strings in Java, complete with examples and some practice questions to enhance your understanding.

// 1. Introduction to Strings :

    String greeting = "Hello, World!";



// 2. String Creation :

    // 2.1 Using String literals - When you create a string using double quotes, the JVM looks for the string in the String Constant Pool. If it exists, it returns a reference to it; otherwise, it creates a new string in the pool.

        String s1 = "Hello";
        String s2 = "Hello";

    // 2.2 Using the new Keyword - When you create a string using the new keyword, it creates a new object in the heap memory, even if an equivalent string exists in the pool.

        String s3 = new String("Hello");
        String s4 = new String("Hello");



// 3. Immutability of Strings - Strings in Java are immutable, meaning once a String object is created, its value cannot be changed. Any operation that modifies a string actually creates a new string.

    String original = "Java";
    String modified = original.concat(" Programming");

    System.out.println(original);  // Output: Java
    System.out.println(modified);  // Output: Java Programming



// 4. Common String Methods : 

    String s = "Hello, World!";
    // 4.1 length() - Returns the length of the string.
        String str = "Hello";
        int len = str.length();  // len = 5
    
    // 4.2 charAt() - Returns the character at the specified index in the string.
        char c = str.charAt(1);  // c = 'e'

    // 4.3 substring(int beginIndex, int endIndex) - Returns a new string that is a substring of this string.
        String sub = str.substring(1, 4);  // sub = "ell"

    // 4.4 indexOf(String str) - Returns the index of the first occurrence of the specified substring in this string.
        int index = str.indexOf("l");  // index = 2

    // 4.5 equals(Object obj) vs. ==
        // 4.5.1 equals(Object obj) - Checks if this string is equal to another object.
        // 4.5.2 == - Checks if this string is equal to another string.

        String s5 = "Hello";
        String s6 = new String("Hello");

        System.out.println(s5.equals(s6));  // true
        System.out.println(s5 == s6);       // false

    // 4.6 equalsIgnoreCase(String str) - Checks if this string is equal to another string, ignoring case considerations.

        String s7 = "Hello";
        String s8 = "hello";
        System.out.println(s7.equalsIgnoreCase(s8));  // true

    // 4.7 compareTo(String anotherString) - Compares two strings lexicographically.

        String s9 = "Hello";
        String s10 = "World";
        System.out.println(s9.compareTo(s10));  // result is negative because "Hello" < "World"

    // 4.8 concat(String str) - Concatenates this string with another string.

        String s11 = "Hello";
        String s12 = s11.concat(" World");
        System.out.println(s12);  // Output: Hello World

    // 4.9 toUpperCase() and toLowerCase()

        String s13 = "Hello";
        System.out.println(s13.toUpperCase());  // Output: HELLO
        System.out.println(s13.toLowerCase());  // Output: hello

    // 4.10 trim() - Removes leading and trailing spaces from this string.

        String s14 = "   Hello   ";
        System.out.println(s14.trim());  // Output: "Hello"

    // 4.11 replace(char oldChar, char newChar) - Replaces all occurrences of oldChar with newChar in this string.

        String s15 = "Hello World";
        System.out.println(s15.replace('H', 'J'));  // Output: "Jello World"

    // 4.12 split(String regex) - Splits this string around matches of the given regular expression.

        String s16 = "Hello, World!";
        String[] parts = s16.split(", ");
        System.out.println(parts[0]);  // Output: "Hello"
        System.out.println(parts[1]);  // Output: "World!"

    // 4.13 valueOf(Object obj) - Returns a string representation of the specified object.

        String s17 = String.valueOf(42);
        System.out.println(s17);  // Output: "42"

    
// 5. StringBuffer and StringBuilder

    // 5.1 StringBuffer - A mutable sequence of characters. It implements the CharSequence interface.

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", World!");
        System.out.println(sb);  // Output: "Hello, World!"

    // 5.2 StringBuilder - A mutable sequence of characters. It implements the CharSequence interface.

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(", World!");
        System.out.println(sb2);  // Output: "Hello, World!"

    // 5.3 Differences and When to Use

        // 5.3.1 Use StringBuilder when you need a mutable string and thread safety is not a concern.
        // 5.3.2 Use StringBuffer when thread safety is required.


// 6. String Formatting :

    // 6.1 String Formatting - Returns a formatted string using the specified format and arguments.

        String s18 = String.format("Hello, %s!", "World");
        System.out.println(s18);  // Output: "Hello, World!"

    // 6.2 printf() - Formats and prints the specified objects.

        String s19 = String.format("Hello, %s!", "World");
        System.out.printf(s19);  // Output: "Hello, World!"


// 7. String Pool :

    String str1 = "Hello";
    String str2 = "Hello";  // Points to the same object as str1 in the string pool



    

    

















    }
}
