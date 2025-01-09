import java.util.Arrays;

public class Week2exercise {
    public static void main(String[] args) {
      // 1. Print 6 times hello
      // Use: for loop

      for (int i = 0; i < 6; i++) {
        System.out.print("hello" + " ");
      }
      System.out.println("");

      // 2. Expected output: "0,1,2,3,4"
      // Use: for loop

      // for (int i = 0; i < 5; i++){
      //   if (i < 4){
      //     System.out.print(i+",");
      //   }else{
      //       System.out.print(i);
      //     }
      //   }
      
        for (int i = 0; i < 5; i++){
          System.out.print(i);
          if (i < 4){
            System.out.print(",");
          }
        }

          System.out.println("");
        

      // 3. Print even numbers between 2 and 20
      // Use: for loop + if

        for (int i = 2; i < 21; i++){
          if ( i % 2 == 0){
            System.out.print(i + " ");
          }
        }
        System.out.println("");

      // 4. Print the numbers, which can be divided by 3 or 5
      // Use: for loop + if

        for (int i = 0; i < 30; i++){
          if (i % 3 == 0 || i % 5 == 0){
            System.out.print(i + " ");
          }
        }
        System.out.println("");

  
      // 5. Sum up the numbers between 0 and 15 and print it
      // Use: for loop

      int sum = 0;
      for (int i = 0; i <= 15; i++){
        sum += i;
      }
      System.out.println(sum);


  
      // 6. sum up all odd numbers betwen 0 - 10
      // Sum up all even numbers betwen 0 - 10
      // Find the product of evenSum and oddSum
      // Use: for loop + if
  
      int oddSum = 0;
      int evenSum = 0;
      for (int i = 0; i <= 10; i++){
        if (i % 2 == 1){
          oddSum += i;
        }else{
          evenSum +=i;
        }
      }
      System.out.println(oddSum*evenSum);



      // 7. Check if 'd' exists in the string.
      // print "d is found."
      // otherwise, print "d is not found."

      String str7 = "ijkabcpodi";
      boolean isFound = false;
      for (int i = 0; i < str7.length() ; i++){
        if (str7.charAt(i) == 'd'){
         isFound = true;
         break;
        }
      }

      if (isFound == true){ // if (isFound){
        System.out.println("d is found.");
      }else{
        System.out.println("d is not found.");
      }
        
        
  
      // 8. Check if the string s8b is a substring of s8a
      // print "s8b is a substring."
      // otherwise, print "s8b is not a substring."
      // Use: for loop + if + substring method

      String s8a = "abcba";
      String s8b = "cba";
      isFound = false; // reset purpose , no need boolean
      for (int i = 0; i < s8a.length()-s8b.length()+1; i++){
        if(s8b.equals(s8a.substring(i,s8b.length()+i))){
          isFound = true;
          break;
        } 
      }        

      if (isFound == true){
        System.out.println("s8b is a substring.");
      } else {
        System.out.println("s8b is not a substring.");
      }

  
      // 9. Count the number of char value in the given String s9
      // print "count=2"
      // Use: for loop + if
      String s9 = "pampers";
      char c9 = 'p';

      int count = 0;
      for (int i = 0; i < s9.length() ; i++){
        if (s9.charAt(i) == c9){
          count++;
        }
      } 
      System.out.println("count=" + count);


  
      // 10. Replace all char value 'x' in the given String array by 'k'
      // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
      // Use: for loop + replace method
      String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

      for (int i= 0; i < arr10.length; i++){
        arr10[i] = arr10[i].replace('x','k');
      }

      System.out.println(Arrays.toString(arr10));



  
      // 11. Count the number of Uppercase char value in the given string s11
      // Print "count uppercase=4"
      // Use: for loop + if
      String s11 = "kLKloOOu";

      count = 0; // reset to 0 or not use "count"
      for (int i = 0; i < s11.length() ; i++){
        if (s11.charAt(i) >= 65 && s11.charAt(i) <=90){
          count++;
        }
      }
      System.out.println(count);


  
      // 12. Print the following pattern of * value
      // *****
      // *****
      // *****

      for (int i =0; i < 3; i++){ // line
        for (int j = 0; j < 5 ; j++){ // number of stars
          System.out.print("*");
        }
        System.out.println("");
      }
      

      // 13. Given a string value s13, each of the char value has its score.
      // Calculate the total score
      // Use: switch + for loop
  
      // l -> 1 score
      // r -> 3 score
      // d -> 2 score
      // u -> 4 score
      // for other character, -1 score
      String s13 = "lrlaudbucp";

      int score = 0;
      for (int i = 0; i < s13.length(); i++){
        switch (s13.charAt(i)) {
          case 'l':
            score++;
            break;
          case 'r':
            score += 3;
            break;
          case 'd':
            score += 2;
            break;
          case 'u' :
            score += 4;
            break;
          default :
            score--;
          }
      }
      System.out.println(score);
  

      // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
          long[] arr14 = new long[4];
          arr14[0] = 1L;
          arr14[1] = 4L;
          arr14[2] = 9L;
          arr14[3] = -4L;

      // 15. Find the max value and min value in arr14
      // Use One Loop + if

        long maxValue = arr14[0]; 
        long minValue = arr14[0];
      for (int i = 1; i < arr14.length ; i++){
        if (arr14[i] > maxValue){
          maxValue = arr14[i];
        }if (arr14[i] < minValue){
          minValue = arr14[i];
        }
      }
      System.out.println(maxValue);
      System.out.println(minValue);



  
      // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
          float[] arr16 = new float[]{0.2f, 0.3f, 0.5f};

      // 17. Add value 0.1 to each of value in array arr16
      // Print: [0.3, 0.4, 0.6]
            for (int i = 0; i < arr16.length; i++){
              arr16[i] = arr16[i] + 0.1f;
            }
            System.out.print(Arrays.toString(arr16));

            System.out.println("");

  
      // 18. Count the number of target strings in the String[]
      String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
      String target = "Tommy";
      // Print "count name=2"

            count = 0; 
            for (int i = 0; i < arr18.length; i++){
              if (target.equals(arr18[i])){
                count++;
              }
            }
            System.out.print("count name=" + count);

            System.out.println("");
  
      // 19. swap the max digit and min digit
      // Assumption: each digit value appear once in the String
      // Print: "49280"
            String s19 = "40289";
            int maxVal = Integer.MIN_VALUE; 
            int minVal = Integer.MAX_VALUE;
            int maxPos = 0;
            int minPos = 0;
            for (int i = 0 ; i < s19.length(); i++){
              if (s19.charAt(i) > maxVal){
                maxVal = s19.charAt(i);
                maxPos = i;

              } 
              if (s19.charAt(i) < minVal){
                minVal = s19.charAt(i);
                minPos = i;
              }
            }

            char [] arr19 = s19.toCharArray();
            char temp = arr19 [maxPos];
            arr19 [maxPos] = arr19 [minPos];
            arr19[minPos] = temp;
          
            System.out.print(arr19);

            System.out.println("");
  
      // 20. Find the longest String in the String array
      // Print "longest=programming"
      String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
      
            String longStr = ""; 
            for (int i = 0; i < arr20.length; i++){
              if (arr20[i].length() > longStr.length()){
                longStr = arr20[i];
              }
            }
            System.out.print("longest=" + longStr);

    }
  }

