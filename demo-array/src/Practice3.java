public class Practice3 {
  public static void main(String[] args){

  // 1
 for(int i = 0; i < 6 ; i++){
   System.out.println("hello");
 }


  
   //2
  for(int i = 0; i < 5 ; i++){
    System.out.println(i);
  }

    //3
    for (int i = 2; i < 21; i++) {
      if (i % 2 == 0) { 
        System.out.println(i);
      }
    }
  


    //4
    for (int i = 1; i < 20; i++){
      if (i % 3 == 0 || i % 5 == 0){
        System.out.println(i);
      }
    }
  


      

    //5 
    int sum = 0; 
    for(int i = 0; i <=15; i++){
      sum = sum +i;
    }
    System.out.println(sum);

  

    //6
    int oddSum = 0;
    int evenSum = 0;
    
    int product = 0;
    for (int i = 0; i < 11; i++){
      if(i % 2 ==1){
        oddSum =sum += i;
      }else {
        evenSum = sum += i;
        }
      product = oddSum*evenSum;
    }
    System.out.println(oddSum);
    System.out.println(evenSum); 
    System.out.println(product);
      

    //7
    String str7 = "ijkabcpodi"; 
    for (int i = 0; i < str7.length(); i++){
      if(str7.charAt(i) == 'd'){
        break;
      }
    }
    System.out.println("d is found.");
  
    
    //8
    String s8a = "abcba";
    String s8b = "cba";
    for (int i =0; i < s8a.length() - s8b.length() + 1; i++){
      if (s8a.substring(i, i + s8b.length()).equals(s8b)){
        break;
      }
    }
    System.out.println("s8b is a substring.");



  //9
        String s9 = "pampers";
        int count = 0;
        for (int i = 0; i < s9.length(); i++) { // loop all values + filtering
          if (s9.charAt(i) == 'p') {
            count++;
          }
        }
        System.out.println(count);
      
    
    //10
    //11
    //12

    //14 
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    //15
    long max = Integer.MIN_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > max) {
        max = arr14[i];
      }
    }
    System.out.println(max);

    long min = Integer.MAX_VALUE; 
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] < min) {
        min = arr14[i];
      }
    }
    System.out.println(min); 


    //18
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    for (int i = 0; i < arr18.length; i++) {
      if (target.equals(arr18[i])) {
      }
    }
    System.out.println("count name=2"); 
      }
    }




    















      
    
