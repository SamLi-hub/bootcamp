public class DemoString {
  public static void main(String[] args) {
    String s = "hello"; // Literal Pool
    String s2 = "hello"; // Literal Pool
    String s3 = s; // s3 and s pointing same object
    String s4 = "hello!";
    String s5 = new String("hello");
    String s6 = String.valueOf("hello"); // Leverage Literal Pool
    String s7 = new String("hello");

    // identityHashCode -> Object reference (address)
    System.out.println(System.identityHashCode(s)); // 1933863327
    System.out.println(System.identityHashCode(s3)); // 1933863327
    System.out.println(System.identityHashCode(s2)); // 1933863327
    System.out.println(System.identityHashCode(s4)); // 112810359
    System.out.println(System.identityHashCode(s5)); // 2124308362
    System.out.println(System.identityHashCode(s6)); // 1933863327
    System.out.println(System.identityHashCode(s7)); // 146589023

    // equals(), ==
    
    // If you use "==" for non-primitive, you are checking the object reference
    // Besides, s.equals() is checking the String value itself
    System.out.println(s == s2); // true
    System.out.println(s.equals(s2)); // true
    
    System.out.println(s == s5); // false
    System.out.println(s.equals(s5)); // true

    System.out.println(s5 == s7); // false


    // String is immutable (Purpose: Reduce Risk)

    // Question: after appending "?", is "s" still the same object? NO.
    s = s + "?";
    System.out.println(System.identityHashCode(s)); // 349885916




  }
}