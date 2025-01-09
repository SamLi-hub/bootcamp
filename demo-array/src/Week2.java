
import java.util.Arrays;

public class Week2 {
  public static void main(String[] args) {
    
    // 1 

    for (int i = 0; i < 6; i++){
      System.out.print("hello ");
    }
      System.out.println("");

    
    // 2
    for (int i = 0; i < 5; i++){
      System.out.print(i);
      if (i < 4){
        System.out.print(",");
      }
    }
      System.out.println("");


    //3
    for (int i = 2; i < 21 ; i++){
      if ( i % 2 == 0){
        System.out.print(i + " ");
      }
    }
    System.out.println("");

    //4
    for (int i = 3; i < 31; i++){
      if (i % 3 == 0 || i % 5 == 0){
        System.out.print( i + " ");
      }
    }
    System.out.println("");


    //5
    int sum = 0;
    for (int i = 0 ; i <= 15; i++ ){
      sum += i; 
    }
    System.out.print(sum);

    System.out.println("");

    //6

    int evenSum =0;
    int oddSum =0;
    for (int i = 0; i < 11; i++){
      if (i % 2 == 0){
        evenSum += i;
      } 
      else if (i % 2 == 1) {
        oddSum += i;
      }
    }
    System.out.println(evenSum * oddSum);

    // 7
    String str7 = "ijkabcpodi";

    boolean isFound = false;
    for (int i = 0; i < str7.length(); i++){
      if (str7.charAt(i) == 'd'){
        isFound = true;
        break;
      }
    }

      if (isFound == true){
        System.out.println("d is found");
      } else {
    System.out.println("d is not found");
  }
  
    // 8
    String s8a = "abcba";
    String s8b = "cba";

    isFound = false;
    for (int i = 0; i < s8a.length() - s8b.length() + 1 ; i++){
      if (s8b.equals(s8a.substring(i,s8b.length()+i))) {
        isFound = true;
        break;
      }
    }

      if(isFound){
        System.out.println("s8b is a substring.");
       } else {
        System.out.println("s8b is not a substring.");
      }
    

    //9
    String s9 = "pampers";
    char c9 = 'p';

    int count = 0;
    for (int i = 0; i < s9.length(); i++){
      if (s9.charAt(i) == c9){
        count++;
      }
    }
    System.out.println("count=" + count);


    //10
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0 ; i < arr10.length; i++){
      arr10[i]= arr10[i].replace('x', 'k');
      }
    
    System.out.println(Arrays.toString(arr10));

    //11
    String s11 = "kLKloOOu";

      count =0;
      for (int i = 0; i < s11.length(); i++){
        if (s11.charAt(i) >= 65 && s11.charAt(i) <= 90){
          count++;
        }
        }
      System.out.println("count uppercase=" + count);

    //12
    
        for (int i = 0; i < 3; i++){
          for (int j = 0; j < 5; j++){
            System.out.print("*");
          }
          System.out.println("");
        }

        //13
        String s13 = "lrlaudbucp";

        count = 0;
        for (int i =0 ; i < s13.length(); i++){
          switch (s13.charAt(i)) {
            case 'l':
              count++;
              break;
            case 'r':
              count = count + 3;
              break;
            case 'd':
              count = count + 2;
              break;
            case 'u':
              count = count + 4;
              break;
            default:
              count--;
              break;
          }
        }
        System.out.println(count);

        // 14
        long[] arr14 = new long [] {1l, 4l,9l, -4l};

        //15

          long maxVal = arr14[0];
          long minVal =  arr14[0];
        for (int i =0; i < arr14.length; i++){
          if (i > maxVal){
            maxVal =arr14[i];
          } else{
            minVal = arr14[i];
          }
        }
        System.out.println(maxVal);
        System.out.println(minVal);

        //16
        float[] arr16 = new float[]{0.2f, 0.3f, 0.5f};

        //17

        for (int i =0; i < arr16.length; i++){
          arr16 [i] = arr16[i] +0.1f;
        }
        System.out.print(Arrays.toString(arr16));
        System.out.println("");


        //18
        String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
        String target = "Tommy";

        count = 0;
        for (int i=0; i < arr18.length; i++){
          if (arr18[i].equals(target)){
            count++;
          }
        }
        System.out.print("count name=" + count);
        System.out.println("");

        //19

        String s19 = "40289";
        int minVal1 = Integer.MAX_VALUE;
        int maxVal1 = Integer.MIN_VALUE;
        int maxPos = 0;
        int minPos = 0;
        for (int i =0; i<s19.length(); i++){
          if(s19.charAt(i) < minVal1){
            minVal1 = s19.charAt(i);
            minPos = i;
          } else {
            maxVal1 = s19.charAt(i);
            maxPos = i;
          }
      }

      char[] arr19 =s19.toCharArray();
      char temp = arr19[maxPos];
      arr19[maxPos] = arr19[minPos];
      arr19[minPos] = temp;
        System.out.println(arr19);

        //20
        String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};

        String longStr = "";
        for (int i =0 ; i < arr20.length; i++){
          if (arr20[i].length() > longStr.length()){
            longStr = arr20[i]; 
          }
        }
        System.out.println("longest =" + longStr);


}
}

