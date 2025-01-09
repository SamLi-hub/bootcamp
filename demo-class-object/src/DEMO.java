
public class DEMO {

  public static void main(String[] args) {
    


    int[] scores = {67, 89, 50, 99, 60, 59};
    Student [] students = new Student[scores.length];

    for (int i =0; i < scores.length; i++){
      students[i] = new Student(i+1, scores[i]);
    }


    int i = Candy.count;
    while(i > 0){
      for (Student student : students){
        if ( student.getScore() >= 60 && i > 0 ){
          student.addOneCandy();
          i--;
          }
       }

       for (Student student : students){
        if ( student.getScore() >= 80 && i > 0){
          student.addOneCandy();
          i--;
          }
       }  
      
      }
        for (Student student : students){
          System.out.println("Student "+ student.getId() + " has " + student.getCandyCount() + " candies");

        }
    }










    }
  
  
