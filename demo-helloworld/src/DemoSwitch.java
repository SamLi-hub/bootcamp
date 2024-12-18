public class DemoSwitch {
  public static void main(String[] args){

    int x =1;
    if (x == 1){ // camparsion 
      System.out.println("x = 1");
    }else if (x == 2){
      System.out.println("x = 2");
    }else if (x ==3){
      System.out.println("x = 3"); //print
    }else {
      System.out.println("somethings else...");
    }

    // switch
    switch (x){ // checking x == ? camparsion is not allowed eg <,=,>...
      case 1:
        System.out.println("x = 1");
        break;
      case 2:
        System.out.println("x = 2");
        break;
      case 3:
        System.out.println("x = 3");
        break;
      default: // (optional eg else)
        System.out.println("something else ...");
    }

    char gender = 'M'; // F,M (Well defined value range)
    switch (gender) {
      case 'M':
        System.out.println("Male");
        break;
      case 'F':
      System.out.println("Female");
        break;
       default:
       System.out.println("unknown");
    }


  }
  
}
