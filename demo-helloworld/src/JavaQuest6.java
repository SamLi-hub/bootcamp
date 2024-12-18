public class JavaQuest6 {
  public static void main(String[] args) {



  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
    // for loop to print first 15 numbers in Fibonacci Sequence
    int first = 0, second = 1;
    // Print the first number
    System.out.print(first + " ");

    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 1; i < 15; i++) {
    System.out.print(second + " ");
    int next = first + second;
    first = second;
    second = next;
}
}
}