public class DemoForEachLoop {
  public static void main(String[] args){
    // for loop, while loop, for-each loop


    // for-each
    for (int integer : arr){
      System.out.println(integer);
    }

    char [] arr2 = new char[] {'p','t','e'};
    // for each loop = > 'pte'
    String str = "";
    for (char c : arr2){
      str += c;
    }
    System.out.println(str);

    String[] arr3 = new String[] {"abc", "ijk", "def"};
    String target = "ijk";
    // true
    Boolean target = false;
    for (String str : arr3){
      if (arr3.equal(target));
      target = true;
    }
    System.out.println(target);



  }
}
