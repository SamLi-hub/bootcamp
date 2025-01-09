public class Practice3 {
  public int scoreOfString(String s){

    int value = 0;
    int sum = 0;
    for (int i = 0; i < s.length() - 1; i++){
      value = s.charAt(i) - s.charAt(i+1);
      value = value < 0 ? value * -1 : value; 
      sum = sum + value;
    }
    return sum;
  
    }
  }





    















      
    
