public class JavaQuest8 {
  
  public static void main(String[] args) {
    
  /**
 * Example Output
 * Second Max = 230
 */

  // Write a loop to find the second max number.
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...

    int temp = 0;

    for (int i = 0; i < nums4.length - 1; i++) {
      if (nums4[i] > nums4[i + 1]) {
        temp = nums4[i];
        nums4[i] = nums4[i + 1];
        nums4[i + 1] = temp;
      }
    }

    for (int i = 0; i < nums4.length - 2; i++) {
      if (nums4[i] > nums4[i + 1]) {
        temp = nums4[i];
        nums4[i] = nums4[i + 1];
        nums4[i + 1] = temp;

      }
    }
    System.out.println(nums4[nums4.length - 2]);


  }
}

