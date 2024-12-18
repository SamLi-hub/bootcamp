

public class DemoComparison {

  public static void main(String[] args){

    //>, <, >=, <=, !=, ==(Ture or false)
    //"==" -> check if they are equals
    //"=" -> assignment

    int age = 20;
    boolean isAdult = age >= 18;
    System.out.println(isAdult);//true

    double pi = 3.14159;
    boolean isCorrect = pi ==3.14159;
    System.out.println(isCorrect);//true

    char gender = 'F';
    boolean isMale = gender == 'M';
    System.out.println(isMale); // false 

    float price = 10.2f;
    System.out.println(price != 10.2f); // false
    
    // ! operator (NOT)
    // !isAdult means is not adult


    //&& AND
    int age2 = 30;
    char gender2 ='F';
    boolean result = age2 >= 30 && gender2 == 'M';
    // event 1:age2 >= 30 -> true
    // event 2: gender2 == 'M' -> false
    System.out.println(result); // false 
    

    // || OR (ture || false)
    boolean result3 = age2 >= 30 || gender2 == 'M';
    // event 1:age2 >= 30 -> true
    // event 2: gender2 == 'M' -> false
    System.out.println(result3); // true 

    // || OR (false || false)
    boolean result4 = age2 < 30 || gender2 == 'M';
    // event 1:age2 < 30 -> false
    // event 2: gender2 == 'M' -> false
    System.out.println(result4); // false

    // AND OR (True AND (false OR true))
   boolean result5 = age2 >= 30 && (gender2 == 'M' || age2 >18);
   System.out.println(result5);//
   //step 1: (gender2 == 'M' || age2 >18) -> false || true -> true
   //step 2: age2 >= 30 -> true. true && true ->true

   // ! the ordering of event checking is different
   // AND go first 
   boolean result6 = age2 >= 18 || age >= 30 && gender2 == 'M';
   System.out.println(result6);
   //step 1: age2 >= 30 && gender2 == 'M' -> true && false -> false 
   //step 2: True || false-> true



  }
}
