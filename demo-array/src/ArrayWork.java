public class ArrayWork {
  public static void main(String[] args){
    System.out.println("Hello");

        // declare array 
        double [] arr2 = new double [5];
        // assign value to array
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;
        double sum = 0;
    

        for (int i = 0; i < arr2.length; i++) { 
        sum = sum + arr2[i];
        }
        System.out.println(sum);
        }
    
        char[] arr4 = new char[] {'b','c','a'};
        //arr4[0] = 'b';
        //arr4[1] = 'c';
        //arr4[2] = 'a';
        int[] ascii = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++){
            ascii[i] = arr4[i]; // char value -> int varible
        }
        for (int i = 0; i < ascii.length; i++){
            System.out.println(ascii[i]);
        }

        String[] arr3 = new string[];
        String target = "abc";
        arr3 [0]; = "abc";
        arr3 [1]; = "def";
        arr3 [2]; = "ijk";
        String target = "abc";
        boolean isTargetExist = false;
        for (int i = 0; i < arr3.length; i++){
          if (target.equals(arr3[i])){
             is TargetExist = true;
          }
        }













      
    }

  

