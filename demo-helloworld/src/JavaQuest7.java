public class JavaQuest7 {
    public static void main(String[] args) {
  /**
 * The sum is 55
 */

  // Sum values of an array

    // Declare a int array, with value 1 to 10
    // code here
    int [] arr = new int []{1,2,3,4,5,6,7,8,9,10};
        // Write a loop to sum up all value in the int array
    // code here ...


    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    System.out.println("The sum is " + sum);
  }
}





