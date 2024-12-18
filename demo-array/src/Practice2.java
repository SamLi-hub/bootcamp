import java.math.BigDecimal;
import java.util.Arrays;

public class Practice2 {
  public static void main (String[] args){
    System.out.println("Hello");



    // int [] arr = new int[] {3,10,11};
    // for (int i = 0; i < arr.length; i++){
    //   if (arr[i] >= 10){
    //     System.out.println(arr[i]);
    //   }
    // }

    // double [] arr2 = new double[] {10.4, 4.3, 3.3, 1.9, 9.9};
    // double sum = 0;
    // for (int i = 0; i < arr2.length; i++){
    //   sum =+ arr2[i];
    // }
    // System.out.println(sum);

    // String[] arr4 = new String[] {"abc", "def", "ijk"};
    // String target = "abc";
    // boolean isTargetExist = false; 
    // for (int i = 0; i < arr4.length; i++){
    //   if (target.equals(arr4[i])){
    //     isTargetExist = true; 
    //   }
    // }

    // String s5 = "123456789";
    // String substr = s5.substring(0, 2);

    // // ! s5's value doesn't change
    // // ! substr is storing a new String value returned by "substring"
    // System.out.println(s5); // abc
    // System.out.println(substr); // ab
    // System.out.println(s5.substring(0, 3)); // abc
    // System.out.println(s5.substring(0, s5.length())); // abc
    // System.out.println(s5.substring(1, s5.length())); // bc
    // System.out.println(s5.substring(1)); // bc

    // for (int i = 0; i < 101; i++) {
    //   if (i % 3 == 0 && i % 4 == 0) {
    //     System.out.println(i);
    //   }
    // }

    // // Counting
    // String s = "hello";
    // // Count the number of 'l'
    // // for + if
    // int count = 0;
    // for (int i = 0; i < s.length(); i++) { // loop all values + filtering
    //   if (s.charAt(i) == 'l') {
    //     count++;
    //   }
    // }
    // System.out.println(count);

    // // continue - skip the rest, go to next iteration
    // count = 0;
    // for (int i = 0; i < s.length(); i++) {
    //   if (s.charAt(i) != 'l') {
    //     continue; // skip count++, go to i++
    //   }
    //   count++;
    // }
    // System.out.println(count);


    // // declare array
    // int[] arr = new int[3];
    // // assign value to array
    // arr[0] = 3;
    // arr[1] = 10;
    // arr[2] = 11;

    // // for loop -> read array values
    // // Print all values, which >= 10
    // for (int i = 0; i < arr.length; i++) { // i = 0,1,2
    //   if (arr[i] >= 10) {
    //     System.out.println(arr[i]);
    //   }
    // }

    // char[] arr4 = new char[] {'b', 'c', 'a'};
    // // arr4[0] = 'b';
    // // arr4[1] = 'c';
    // // arr4[2] = 'a';
    // int[] ascii = new int[arr4.length];
    // for (int i = 0; i < arr4.length; i++) { // 0,1,2
    //   ascii[i] = arr4[i]; // char value (arr4[i]) -> int variable (ascii[i])
    // }

    // // array - sum all elements
    // int[] arr6 = new int[] {9, 8, 99, 98};
    // int sum = 0;
    // for (int i = 0; i < arr6.length; i++) {
    //   sum = sum + arr6[i];
    // }
    // System.out.println(sum);

    // int rCount = 0;
    // int lCount = 0;
    // int balanced = 0;
    // for (int i = 0; i < s.length(); i++){
    //     if (s.charAt(i) == 'R')
    //     rCount++;
    //     else
    //     lCount++;
    //     if (rCount == lCount){
    //         balanced++;
    //         rCount = 0;
    //         lCount = 0;
    //     }
    //     return;
    // 1 - 100, print all numbers, which can be divided by 3 and 4
    // continue
      // declare double array, length = 5
    // assign values -> 10.4, 4.3, 3.3, 1.9, 9.9
    // Sum up all values in the double array

// declare double array, length = 5
    // assign values -> 10.4, 4.3, 3.3, 1.9, 9.9
    // Sum up all values in the double array
    
    
    // Integer[] arr11 = new Integer[] {9, 6, 4};
    // // Products for all numbers
    // int product = 1;
    // for (int i = 0; i < arr11.length; i++) {
    //   product *= arr11[i];
    // }
    // System.out.println(product); // 216

    BigDecimal bd13 = BigDecimal.valueOf(10);
    BigDecimal bd14 = BigDecimal.valueOf(3);
    BigDecimal bd15 = bd13.divide(bd14, BigDecimal.ROUND_DOWN); //
    System.out.println(bd15.doubleValue()); // 3.0, Non-terminating decimal







  }
        }
    