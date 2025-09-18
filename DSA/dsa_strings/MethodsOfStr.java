package dsa_strings;

import java.util.Arrays;

public class MethodsOfStr {
    public static void main(String[] args) {
        String s1 = "Hello";                 // String literal (goes in String pool)
        String s2 = new String("World");     // Explicit object (heap)


        String s3 = "Java";
        System.out.println(s3.length()); // 4

        System.out.println("Hello".charAt(1)); // 'e'

        String s4 = "Substring";
        System.out.println(s4.substring(3));     // "string"
        System.out.println(s4.substring(0, 3));  // "Sub"

        System.out.println("java".equals("java"));         // true
        System.out.println("Java".equals("java") );          // false
        System.out.println("Java".equalsIgnoreCase("java")); // true

        System.out.println("apple".compareTo("banana"));      // -1 (because "a" < "b")
        System.out.println("abc".compareTo("abc"));// 0
        System.out.println("dog".compareTo("cat")); // > 0

           /*  LowerCase and UpperCase
           "Java".toLowerCase()  // "java"
            "java".toUpperCase()  // "JAVA"*/

        System.out.println("  Hello  ".trim()  );// "Hello");

        System.out.println("apple".replace('p', 'b') ); //"abble"
        System.out.println("12-34-56".replaceAll("-", ":")); //"12:34:56"

        System.out.println("hello world".contains("world") );// true


        String s = "Java,Python,C++";
        String[] parts = s.split(",");
        System.out.println(Arrays.toString(parts)); // [Java, Python, C++]

        /*"".isEmpty()       // true
        " ".isEmpty()      // false
        " ".isBlank()      // true */


        
        // Interning
        String c1 = new String("hello");
        String c2 = c1.intern(); // s2 is now from string pool
        


    }
}
