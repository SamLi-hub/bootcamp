public class Exercise20241210 {
  public static void main(String[] args){
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    //...7.3 * 3 + 6.5 * 4 = 47.9

    double totalamount = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;
    System.out.println(totalamount);





    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    // //(73 + 60 + 61) / 3 = 64.67
    double averageScore = (mathScore + englishScore + historyScore) / 3.0;
    System.out.println(averageScore);



    // byte-> short -> int -> long
    byte maxByte = 127;

    // int value -> byte
    maxByte = maxByte - 1; // Java: is it safe? Not safe
    //byte value + int value -> int value
    // can we assign int value to byte variable?(downcasting)

    int x = maxByte;//Java： is it safe? it is safe


    //! Java: (1) Compile time + (2) Run time
    //(1) java file (.jave) -> class file(.class):java code -> byte code (machine)
       //(1.1) compile fail. for example (missing; --> syntax error)
       //(1.2) compile success  
    //(2)Jave Virtual Machine (JVM)-> convert class file to machine code -> execute machine code 


  }
}
