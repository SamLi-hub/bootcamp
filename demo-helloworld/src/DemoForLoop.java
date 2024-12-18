public class DemoForLoop {
  public static void main(String[] args) {
    //2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x);

    // For Loop
    // 

    // for ( ; ; ){
    //}

    // "i < 3" -> continue criteria
    // "i++" -> moditfier
    // ! you have to let the modifier work with "continue criteria"
    // ! so that coutinue crtieria at the end become false

    for (int i = 0; i < 3; i++) { // 3-0
      System.out.println("hello");


    }
    // Step 1: int i = 0;
    // Step 2: i < 3 (question) - > true
    // Step 3: if true, print hello
    // Step 4: i++, i become 1
    // Step 5: i < 3 (question), - > true
    // Step 6: if true, print hello
    // Step 7: i++, i become 2
    // Step 8: i < 3 (question), -> true
    // Step 9: if true, print hello
    // Step 10: i++, i become 3
    // Step 11: i < 3 (question) -> false
    // Step 12: exit for loop


    for (int i = 0; i < 5; i++){ // 0,1,2,3,4
    System.out.println(i);
    }


    // print even numbers (i % 2 ==0)
    for (int i = 0; i < 10; i++){
    if (i % 2 == 0){// even number definition
      System.out.println(i);
    }
    }

    // print 0-100, divided by 3 and divided by 4
    // for + if
    for (int i =0; i < 101; i++)
    if (i % 3 == 0 && i % 4 == 0){
      System.out.println(i);
    }
  }

    // sum up 0-20: 0+1+2...+20
    int sum = 0;
    for (int i = 0; i <= 20; i++) {
      sum = sum + i;
    }
    System.out.println(sum);//210
    // System.out.println(i);// ! i is declared within the for loop

    // sum up all odd numnbers between 0 - 10
    int sum1 = 0;
    for (int i = 0; i < 11; i++){
    if (i % 2 == 1){
      sum1 = sum1 + i;
    }
 }
   System.out.println(sum);// 25
    
    // sum up all even numnbers between 0 - 10
    int sum2 = 0;
    for (int i = 0; i < 11; i++){
      if (i % 2 == 0){
        sum2 = sum2 +i;
      }
    }
    System.out.println(sum2);//30

    // ! Find the difference between evenSum an oddSum -> +ive number
    int difference = sum2 - sum1;
    System.out.println(difference);


    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < 11; i++){
      if (i % 2 == 1){
         oddSum += i;
               }else {
                evenSum += i;
               }
    }
    int difference = -1;
    if (oddSum > evenSum){
      difference = oddSum - evenSum;
    }else {
      difference = evenSum - oddSum;
    }
    System.out.println(difference);

      int difference = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    System.out.println(diff); //5







    // Searching
    String str = "abcdefijk";

    //1. check if 'd' exists in the string
    // for loop + if + charAt
    boolean found = false;
    for( int i = 0; i < str.length() ; i++){
      if (str.charAt(i) == 'd'){
        found = true;
        break; // break the nearest loop

      }
    }

    System.out.println(found);
      // Test Case:
      // 1. "abcdefijk"
      // 2. "abcefijk"
      // 3. ""
      // 4. "abcdefijkd"

    // 2. check if the string value contains given sub-string
    String subst = "lo";
    String str2 = "hello";
    // for loop + substring
    boolean isSubstringExist = false;
    for( int i = 0; i < str2.length() ; i++){
      if(str2.substring(i, i + substr.length()).equals(substr)){
        isSubstringExist = true;
        break; // break the nearest loop
      }
    }
    System.out.println(isSubstringExist);// true


     //Counting 
     String s = "hello";
     // Count the number of 'l'
     // for + if 

    int count = 0;
    for(int i = 0 ; i < s.length() ; i++){// loop all value + filtering
      if(s.charAt(i) == 'l'){
        count++;
      }
    }
      System.out.println(count);


      // continue - skip the rest , go to next iteration
      count = 0;
      for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) != 'l'){
          continue; // skip count++, go to i++
        }
        count++;
      }
      System.out.println(count);

      // 1-100, print all numbers which can be divided by 3 and 4
      // continue

      for( int i = 1; i <= 100; i++){
        if (i % 3 == 0 && i % 4 != 0 // event 1
        || i % 4 == 0 && i % 3 != 0 // event 2
        || i % 3 != 0 && i % 4 != 0  // event 3
      
        ){
          continue;
        }
      
      System.out.println(i);
      }


      // nested loop
      for (int i = 0; i < 3 ; i++){
        for (int j = 0; j < 4; j++){
          // System.out.println("*") ; // print and next line
          System.out.print("*");
        }
        // go to i++
      }
        // step 1: i = 0, j = 0, print *
        // step 2: i = 0, j = 1, print *
        // step 3: i = 0, j = 2, print *
        // step 4: i = 0, j = 3, print *
        // step 5: i = 1, j = 0, print *
        // step 6: i = 1, j = 1, print *
        // step 7: i = 1, j = 2, print *
        // step 8: i = 1, j = 3, print *
        // step 9: i = 2, j = 0, print *
        // step 10: i = 2  , j = 1, print *
        // step 11: i = 2, j = 2, print *
        // step 12: i = 2, j = 3, print *


      // *
      // **
      // ***
      // ****
    
      for (int i = 0; i < 5  ; i++){ // number of line
        System.out.println(""); 
        for (int j = 0; j < i; j++) // number of *
        System.out.print("*");
      } 


      int n = 5;
      for (int i = 0; i < n  ; i++){
        for (int j = 0; j < i; j++){
        System.out.print("*");
        }
        System.out.println();

        int n = 4;
        for (int i = 0; i < n  ; i++){
          for (int j = 0; j < i +1 ; j++){
          System.out.print("*");
          }
          System.out.println();
    
          }











          

  }
}
