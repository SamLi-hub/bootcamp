import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args){

    // Java Project (load built-in tools, String, Primitives)
    // proactively import non-built-in
    String s = "abc";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int day = scanner.nextInt(); // scanner.next
    // num = num * 2
    // System.out.println("num="+ num); // String + int -> String

    // scanner.nextLine();

    // System.out.println("Please input a String:");
    // String str= scanner.nextLine();
    // System.out.println("str=" + str);


    // String x = "hello";
    // for (int i = 0; i < num ; i++){
    //   System.out.println(x);
    // }

    //for loop
    int totalHours = 0;
    for (int i = 0; i < day ; i++){
      totalHours += 24;
    }
    System.out.println(totalHours);

    







  }
  
}
